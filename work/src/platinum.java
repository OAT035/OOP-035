public class platinum extends member{
    public platinum(String name, double purchase){
        super(name, purchase);
    }

    @Override
    public double cal() {
        // TODO Auto-generated method stub
        return getPurchase() * .50d;
    }

}
