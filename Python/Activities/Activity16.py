class car:
    def __init__(self,manf,model,make,transmision,color):
        self.manf=manf
        self.model=model
        self.make=make
        self.transmision=transmision
        self.color=color
    def accelerate(self) :
        print(self.manf+" "+self.model+" has started moving")
    def stop(self) :
        print(self.manf+" "+self.model+" has stopped moving")
car1 = car("Toyota", "Corolla", "2015", "Manual", "White")
car2 = car("Maruti", "800", "2013", "Manual", "Red")
car3 = car("Suzuki", "Swift", "2017", "Automatic", "Black")   
car1.accelerate()
car1.stop()  
car2.accelerate()
car2.stop()   
car3.accelerate()
car3.stop()      