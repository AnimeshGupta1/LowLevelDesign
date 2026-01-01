package DecoratingPattern;

abstract class CharacterDecorator implements Character{
    protected Character character;

    public CharacterDecorator(Character ch) {
        this.character = ch;
    }
}
