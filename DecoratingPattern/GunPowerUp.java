package DecoratingPattern;

public class GunPowerUp extends CharacterDecorator{
    public GunPowerUp(Character c) {
        super(c);
    }
    
    public String getAbilities() {
        return character.getAbilities() + " with Gun";
    }
}
