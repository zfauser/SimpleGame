/* autogenerated by Processing revision 1286 on 2022-10-31 */
import processing.core.*;
import processing.data.*;
import processing.event.*;
import processing.opengl.*;

import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class SimpleGame extends PApplet {

// Blackjack in processing

 public void setup() {
    background(48, 91, 65);
    /* size commented out by preprocessor */;
    frameRate(60);
    noStroke();
    fill(255, 255, 255);
    textSize(32);
    textAlign(CENTER);
    text("Blackjack", width/2, 50);
    text("Press any key to start", width/2, 100);
}


  public void settings() { size(1024, 512); }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SimpleGame" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
