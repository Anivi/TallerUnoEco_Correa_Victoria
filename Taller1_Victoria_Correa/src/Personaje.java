import processing.core.PApplet;

public abstract  class Personaje {
  protected int x;
  protected int y;
  protected int vel;
  protected int puntaje;
  protected PApplet app;
  

  public Personaje(PApplet app, int x, int y) {
	this.app=app;
    this.x=x;
    this.y=y;
    vel=0;
  }

  public abstract void pintar();
  
  
  public int getX (){
  return x;
  }
  
  public int getY (){
  return y;
  }
  
  public void setY (int y){
  this.y=y;
  }
  
}