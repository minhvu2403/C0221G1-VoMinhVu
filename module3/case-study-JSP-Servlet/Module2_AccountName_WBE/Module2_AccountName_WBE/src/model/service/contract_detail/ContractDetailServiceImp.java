package model.service.contract_detail;

import model.bean.contract.AttachService;
import model.bean.contract.ContractDetail;
import model.repository.ContractDetailRepository;

import java.util.List;

public class ContractDetailServiceImp implements IContractDetailService {
     ContractDetailRepository contractDetailRepository =new ContractDetailRepository();

    @Override
    public boolean add(ContractDetail contractDetail) {
        return contractDetailRepository.add(contractDetail);
    }

    @Override
    public List<AttachService> findAllAttachService() {
        return contractDetailRepository.findAllAttachService();
    }
}
