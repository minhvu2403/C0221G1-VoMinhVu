package model.service.service;

import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;

import java.util.List;

public interface IEService {
    boolean add(Service service);
    List<RentType> findAllRentType();
    List<ServiceType>findAllServiceType();
    List<Service> findByAll();

}
