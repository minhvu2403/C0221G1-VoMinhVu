package model.service.contract;

import model.bean.contract.Contract;
import model.repository.ContractRepository;

import java.util.List;

public class ContractServiceImp implements IEContractService {
    ContractRepository contractRepository=new ContractRepository();

    @Override
    public boolean add(Contract contract) {
        return contractRepository.add(contract);
    }

    @Override
    public List<Contract> findByAll() {
        return contractRepository.findByAll();
    }
}
