public class Moderno implements GUIFactory {
    @Override
    public Chair createChair(){
        return new ChairMod();
    }; 
    
    @Override
    public CoffeTable createCoffeTable(){
        return new CoffeTableMod();
    };

}
