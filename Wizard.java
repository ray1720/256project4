public class Wizard extends Character {
  int hp;
  public int getHp() {
    return hp;
  }
  public void setHp(int newHp) {
    this.hp = 6 + mod(this.constitution);
  }
}