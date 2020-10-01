public class sinGraph extends JApplet {
    
    public void init()
    {
        setSize(900, 900);
    }

    public void paint(Graphics g)
    {
        g.drawLine(0,350,900,350); 
        g.drawLine(450,0,450,900); 
        
        g.drawLine(0,360,900,360); 
        g.drawLine(0,340,900,340); 
        
        g.setColor(Color.blue);
        double pi=3.1415926;
        
        for(double x=-450;x<=450;  x+=0.5)
        {
            double y = 10 * sin(x*(pi/30));
            
            int Y = (int)y;
            int X = (int)x;
            g.drawLine(450+X,350-Y,450+X,350-Y);
        
        }
    }
    
}
