class Trojkot
{
  int xa, ya;
  int xb, yb;
  int xc, yc;


  Trojkot()
  {
    xa=(int)random(640);
    ya=(int)random(480);
    xb=(int)random(640);
    yb=(int)random(480);
    xc=(int)random(640);
    yc=(int)random(480);
  }

  void draw()
  {  
    triangle(xa, ya, xb, yb, xc, yc);
  }

  void psuj(int xd, int yd)
  {
    xa=xa+xd;
    ya=ya+yd;
    xb=xb-xd;
    yb=yb-yd;
    xc=xb+xd;
    yc=yb-yd;
  }
 
}