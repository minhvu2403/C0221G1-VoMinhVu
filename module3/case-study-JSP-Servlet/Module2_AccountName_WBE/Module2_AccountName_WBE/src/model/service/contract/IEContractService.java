package model.service.contract;

import model.bean.contract.Contract;

import java.util.List;

public interface IEContractService {
    boolean add (Contract contract);
     List<Contract>findByAll();



}
