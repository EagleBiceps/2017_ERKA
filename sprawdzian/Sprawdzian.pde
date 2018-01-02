
int kolor;
int a = 0;
int b = 0;
Trojkot t1=new Trojkot();
Trojkot t2=new Trojkot();
Trojkot t3=new Trojkot();
void setup()
{
  size(640, 480);
  frameRate(100);
}
void draw()
{

  background(kolor, 0, 0);
  t1.draw();
  t2.draw();
  t3.draw();
  t1.psuj(1,2);
  t2.psuj(1,2);
  t3.psuj(1,2);
  int x= mouseX;
  int y= mouseY;
  fill(#A20505);
  strokeWeight(5);
  stroke(#FEFF00);
  rect(x+10, y-20, 30+a, 15+b);
}

void keyPressed()
{
  if (key=='o')
    kolor=(int)random(256);
  if (key=='x')a++;
  if (key=='y')b++;
  if (key=='X')a--;
  if (key=='Y')b--;
}