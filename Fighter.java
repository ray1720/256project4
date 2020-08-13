public class Fighter extends Character {
  int hp;
  public int getHp() {
    return hp;
  }
  public void setHp(int newHp) {
    this.hp = 10 + mod(this.constitution);
  }
}