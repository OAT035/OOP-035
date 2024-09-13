public class gold extends member{
    public gold(String name, double purchase){
        super(name, purchase);
    }

    @Override
    public double cal() {
        // TODO Auto-generated method stub
        return getPurchase () * .15f;
    }

}

