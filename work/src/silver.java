public class silver extends member{
    public silver (String name, double purchase){
        super(name, purchase);
    }
    
    @Override
    public double cal() {
        // TODO Auto-generated method stub
        return super.getPurchase()*.10d;
    }
    }
    
