fun main(){
    val mal = MallordDuck(FlyWithWings(),QuackSound())
    mal.display()
    mal.performFly()
    mal.performQuack()


    println("---------------------------------------")

    //RubberDuck now has no concrete implementation of behaviour and is assigned during run time

    //can create a rubber duck that can fly !!!

    val rub = RubberDuck(NoFly(),SqueakSound())
    rub.display()
    rub.performFly()
    rub.performQuack()



    println("---------------------------------------")

    val rock = RocketDuck(RocketFly(),NoSound())
    rock.display()
    rock.performFly()
    rock.performQuack()
    println("Some machinery defect occurred!!!")
    //possible as implementation outside Duck Class
    rock.setFlyBehaviour(NoFly())
    rock.performFly()

    println("---------------------------------------")
    //A hunter uses device to mimic Quack - No Duck inherited
    //Reused algorithm of Quack
    val device = Device(QuackSound())
    device.display()
    device.mimicSound()

    // Final Notes
//    This is STRATEGY PATTERN
//    defines a family of algorithms[FlyBehaviour,QuackBehaviour],
//    encapsulates each one(all behaviours in one ) and
//    make then interchangeable(can be assigned on run time with set function),
//    Strategy lets the algorithm(fly or quack behaviour vary independently of Client that use it - Duck or device)

}