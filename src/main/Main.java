package main;
import processing.core.*;

public class Main extends PApplet {
  public static void main(String args[]){
      PApplet.main(new String[] {"main.Main"});
  }
  public void settings(){
    size(400, 400);
  }
  public void setup(){
    background(0, 0, 0);
    smooth();
    strokeWeight(5);
  }
  public void draw(){
    noStroke();
    fill(0,10);
    rect(0,0,width,height);
    stroke(255);
    if (mousePressed) {
      line(mouseX,mouseY,pmouseX,pmouseY);
    }
  }
}