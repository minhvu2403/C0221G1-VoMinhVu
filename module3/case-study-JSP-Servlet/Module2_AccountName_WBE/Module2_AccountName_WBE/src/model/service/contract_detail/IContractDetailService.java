package model.service.contract_detail;

import model.bean.contract.AttachService;
import model.bean.contract.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    boolean add(ContractDetail contractDetail);
    List<AttachService> findAllAttachService();

}
