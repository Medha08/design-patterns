fun main(){
    val mal = MallordDuck()
    mal.display()
    mal.performFly()
    mal.performQuack()


    println("---------------------------------------")

    val rub = RubberDuck()
    rub.display()
    rub.performFly()
    rub.performQuack()



    println("---------------------------------------")

    val rock = RocketDuck()
    rock.display()
    rock.performFly()
    rock.performQuack()
    println("Some machinery defect occurred!!!")
    //possible as implementation outside Duck Class
    rock.setFlyBehaviour(NoFly())
    rock.performFly()

}