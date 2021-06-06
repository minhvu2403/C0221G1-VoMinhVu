package model.repository;

import model.bean.contract.AttachService;
import model.bean.contract.ContractDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDetailRepository extends BaseRepository {
    BaseRepository baseRepository = new BaseRepository();
    public static final String INSERT_NEW_CONTRACT_DETAIL = "insert into contract_detail (quantity,contract_id,attach_service_id) value (?, ?, ?)";
    private final String SELECT_ALL_ATTACH_SERVICE = "select * from attach_service";

 public  boolean add(ContractDetail contractDetail){
     Connection connection = baseRepository.connectDataBase();
     boolean check=false;
     try {
         PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_CONTRACT_DETAIL);
         preparedStatement.setInt(1, contractDetail.getQuantity());
         preparedStatement.setInt(2, contractDetail.getContractId());
         preparedStatement.setInt(3,contractDetail.getAttachServiceId());
         check = preparedStatement.executeUpdate() > 0;
         preparedStatement.close();
         connection.close();
     } catch (SQLException e) {
         e.printStackTrace();
     }
     return check;
 }
 public List<AttachService> findAllAttachService(){
     Connection connection = baseRepository.connectDataBase();
     List<AttachService> attachServices=new ArrayList<>();
     try {
         PreparedStatement statement = connection.prepareStatement(SELECT_ALL_ATTACH_SERVICE);
         ResultSet resultSet = statement.executeQuery();
         while (resultSet.next()) {
             int attachServiceId = resultSet.getInt("attach_service_id");
             String attachServiceName = resultSet.getString("attach_service_name");
             Double attachServiceCost = Double.parseDouble(resultSet.getString("attach_service_cost"));
             String attachServiceUnit = resultSet.getString("attach_service_unit");
             String attachServiceStatus = resultSet.getString("attach_service_status");
              attachServices.add(new AttachService(attachServiceId,attachServiceName,attachServiceCost,attachServiceUnit,attachServiceStatus));
         }
         statement.close();
         connection.close();
     } catch (SQLException e) {
         e.printStackTrace();
     }
     return attachServices;

 }
}
