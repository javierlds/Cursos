from car import Car

if __name__ == "__main__":
    car = Car()
    car.license = "AMS5579"
    car.driver = "Javier Paez"
    print(vars(car))

    car2 = Car()
    car2.license = "BPOL8755"
    car2.driver = "Jose Perez"
    print(vars(car2))