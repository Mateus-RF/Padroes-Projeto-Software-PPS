public class Vitoriano implements GUIFactory {

    @Override
    public Chair createChair(){
        return new ChairVit();
    }; 
    
    @Override
    public CoffeTable createCoffeTable(){
        return new CoffeTableVit();
    };

}
