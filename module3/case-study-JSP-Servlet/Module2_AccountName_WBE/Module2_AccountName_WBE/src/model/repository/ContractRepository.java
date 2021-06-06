package model.repository;

import model.bean.contract.Contract;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContractRepository extends BaseRepository {
    BaseRepository baseRepository = new BaseRepository();
    public static final String INSERT_NEW_CONTRACT = "insert into contract (contract_start_date,contract_end_date, contract_deposit,contract_total_money, customer_id,employee_id, service_id) value (?,?,?,?,?,?,?)";
    private static final String SELECT_ALL_CONTRACT = "select* from contract";

    public boolean add(Contract contract) {
        Connection connection = baseRepository.connectDataBase();
        boolean check = false;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_CONTRACT);
            preparedStatement.setString(1, contract.getContractStartDate());
            preparedStatement.setString(2, contract.getContractEndDate());
            preparedStatement.setDouble(3, contract.getContractDeposit());
            preparedStatement.setDouble(4, contract.getContractTotalMoney());
            preparedStatement.setInt(5, contract.getCustomerId());
            preparedStatement.setInt(6, contract.getEmployeeId());
            preparedStatement.setInt(7, contract.getServiceId());
            check = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;

    }
    public List<Contract> findByAll(){
        Connection connection = baseRepository.connectDataBase();
          List<Contract> contractList=new ArrayList<>();
          try{
              PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CONTRACT);
              ResultSet resultSet = preparedStatement.executeQuery();// dùng cho câu lệnh select;
           while (resultSet.next()){
               int id=Integer.parseInt(resultSet.getString("contract_id"));
               String contractStartDate=resultSet.getString("contract_start_date");
               String contractEndDate=resultSet.getString("contract_end_date");
               double contractDeposit=Double.parseDouble(resultSet.getString("contract_deposit"));
               double contractTotalMoney =Double.parseDouble(resultSet.getString("contract_total_money"));
               int customerId =Integer.parseInt(resultSet.getString("customer_id"));
               int employeeId =Integer.parseInt(resultSet.getString("employee_id"));
               int serviceId =Integer.parseInt(resultSet.getString("service_id"));
               Contract contract=new Contract(id,contractStartDate,contractEndDate,contractDeposit,contractTotalMoney,employeeId,customerId,serviceId);
               contractList.add(contract);
           }
          } catch (SQLException e) {
              e.printStackTrace();
          }
          return contractList;
    }

}
