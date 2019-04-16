

import processing.core.PApplet;
import processing.core.PImage;

public class Madre extends Personaje{
  
	
	private PImage madre;
	private int punt;

  public Madre (PApplet app, int x, int y) {
    super(app, x, y);
    
   //CARGAR IMAGENES ARREGLO

    madre =app.loadImage("madre.png");
    madre.resize(170, 170);

  }

  @Override
  public void pintar() {

   app.image(madre,x,y);
    
   if (app.frameCount % 15==0) {
      punt++;
    }    
      if (punt>1) {
        punt=0;
      }
      
    }
  
}
  