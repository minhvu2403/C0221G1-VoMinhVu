package model.repository;

import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepository extends BaseRepository {
    BaseRepository baseRepository = new BaseRepository();
    public static final String INSERT_NEW_SERVICE = "insert into service (service_name,service_area, service_cost, service_max_people,standard_room, description, pool_area, number_of_floor, service_type_id,rent_type_id) value (?, ?, ?,?,?,?,?,?,?,?)";
    private final String SELECT_ALL_RENT_TYPE = "select * from rent_type";
    private final String SELECT_ALL_SERVICE_TYPE = "select * from service_type";
    String SELECT_ALL_SERVICE = "select * from service";
    public boolean add(Service service) {
        Connection connection = baseRepository.connectDataBase();
        boolean check=false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_SERVICE);
            preparedStatement.setString(1, service.getName());
            preparedStatement.setDouble(2, service.getArea());
            preparedStatement.setDouble(3, service.getCost());
            preparedStatement.setInt(4, service.getServiceMaxPeople());
            preparedStatement.setString(5, service.getStandardRoom());
            preparedStatement.setString(6, service.getDescription());
            preparedStatement.setDouble(7, service.getPoolArea());
            preparedStatement.setInt(8, service.getNumberOfFloor());
            preparedStatement.setInt(9, service.getServiceType());
            preparedStatement.setInt(10, service.getRentType());
            check = preparedStatement.executeUpdate() > 0;

            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
         return check;

    }
    public List<RentType> findAllRentType() {
        Connection connection = baseRepository.connectDataBase();
        List<RentType> rentTypes = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_RENT_TYPE);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int rentTypeId = resultSet.getInt("rent_type_id");
                String rentTypeName = resultSet.getString("rent_type_name");
                Double rentTypeCost = resultSet.getDouble("rent_type_cost");
               rentTypes.add(new RentType(rentTypeId,rentTypeName,rentTypeCost));

            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rentTypes;
    }
    public  List<ServiceType> findAllServiceType(){
        Connection connection = baseRepository.connectDataBase();
        List<ServiceType> serviceTypes = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_SERVICE_TYPE);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int serviceTypeId = resultSet.getInt("service_type_id");
                String serviceTypeName = resultSet.getString("service_type_name");
                 serviceTypes.add(new ServiceType(serviceTypeId,serviceTypeName));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceTypes;

    }

    public List<Service> findByAll(){
        Connection connection = baseRepository.connectDataBase();
        List<Service> serviceList =new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SERVICE);
            ResultSet resultSet = preparedStatement.executeQuery();// dùng cho câu lệnh select;
            while (resultSet.next()) { // duyệt trên từng hàng của bảng
                int id = Integer.parseInt(resultSet.getString("service_id"));
                String name = resultSet.getString("service_name");
                Double serviceArea = Double.parseDouble(resultSet.getString("service_area"));
                Double serviceCost = Double.parseDouble(resultSet.getString("service_cost"));
                int serviceMaxPeople = resultSet.getInt("service_max_people");
                String standardRoom = resultSet.getString("standard_room");
                String description = resultSet.getString("description");
                int poolArea = resultSet.getInt("pool_area");
                int numberOfFloor = resultSet.getInt("number_of_floor");
                int serviceTypeId = Integer.parseInt(resultSet.getString("service_type_id"));
                int rentTypeId =Integer.parseInt(resultSet.getString("rent_type_id"));
                Service service=new Service(id,name,serviceArea,serviceCost,serviceMaxPeople,standardRoom,description,poolArea,numberOfFloor,serviceTypeId,rentTypeId);
                 serviceList.add(service);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceList;
    }
}

