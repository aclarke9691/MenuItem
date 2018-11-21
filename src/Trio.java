public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    
    public Trio(Sandwich sandwich, Salad salad, Drink drink)
    {
        this.sandwich=sandwich;
        this.salad=salad;
        this.drink=drink;
    }

    public String getName()
    {
        String sandwichName= this.sandwich.getName();
        String saladName= this.salad.getName();
        String drinkName= this.drink.getName();
        return sandwichName + "/" + saladName + "/" + drinkName + " Trio";
    }

    public double getPrice()
    {
        double sandwichPrice= this.sandwich.getPrice();
        double saladPrice= this.salad.getPrice();
        double drinkPrice= this.drink.getPrice();
        if (sandwichPrice < saladPrice && sandwichPrice< drinkPrice)
        {
            return saladPrice+drinkPrice;
        }
        else
        {
            if (saladPrice<sandwichPrice && saladPrice<drinkPrice)
            {
                return sandwichPrice+drinkPrice;
            }
            else
            {
                return sandwichPrice+saladPrice;
            }
        }
    }
}
