package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao carDao;

   
    @Override
    public List<Car> listAllCars() {
        return carDao.listAllCars();
    }
}
