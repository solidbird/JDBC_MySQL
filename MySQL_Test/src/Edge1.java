import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

public class Edge1 implements GLEventListener {
   private GLU glu = new GLU();

   public static void main(String[] args) {
   
      //getting the capabilities object of GL2 profile
      final GLProfile profile = GLProfile.get(GLProfile.GL2);
      GLCapabilities capabilities = new GLCapabilities(profile);

      // The canvas
      final GLCanvas glcanvas = new GLCanvas(capabilities);
      Edge1 b = new Edge1();
      glcanvas.addGLEventListener(b);
      glcanvas.setSize(400, 400);

      //creating frame
      final JFrame frame = new JFrame (" 3d edge");

      //adding canvas to it
      frame.getContentPane().add(glcanvas);
      frame.setSize(frame.getContentPane().getPreferredSize());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }//end of main

@Override
public void display(GLAutoDrawable arg0) {
	   
    // TODO Auto-generated method stub
    final GL2 gl = arg0.getGL().getGL2();
    gl.glTranslatef(0f, 0f, -3f);
    gl.glBegin(GL2.GL_LINES);
    gl.glVertex3f(0f,0f,0f);
    gl.glVertex3f(0f,1f, 0f);
    gl.glEnd();
    
    gl.glBegin(GL2.GL_LINES);
    gl.glVertex3f(0f,1f, 0f);
    gl.glVertex3f(1f,1f, 0f);
    gl.glEnd();
    
    gl.glBegin(GL2.GL_LINES);
    gl.glVertex3f(1f,0f,0f);
    gl.glVertex3f(1f,1f, 0f);
    gl.glEnd();
    
    gl.glBegin(GL2.GL_LINES);
    gl.glVertex3f(1f,1f, 0f);
    gl.glVertex3f(0f,0f, 0f);
    gl.glEnd();
    
   // gl.glBegin(GL2.GL_LINES);
   // gl.glVertex3f(-0.75f,0f,1f);
   // gl.glVertex3f(0f,-0.75f, 1f);
   // gl.glEnd();

    
    /*
     * //3d line
    gl.glBegin(GL2.GL_LINES);

    //3 units in to the window
    gl.glColor3f(0f, 0f, 255f);
    gl.glVertex3f(0f,-1f,0f);
    gl.glVertex3f(-1f,0f,0f);
    gl.glEnd();

    //top
    gl.glBegin(GL2.GL_LINES);
    gl.glColor3f(255f, 0f, 0f);
    gl.glVertex3f(-0.75f,0f,0);
    gl.glVertex3f(-1f,0f,0f);
    gl.glEnd();

    //bottom
    gl.glBegin(GL2.GL_LINES);
    gl.glColor3f(0f, 255f, 0f);
    gl.glVertex3f(0f,-0.75f, 0);
    gl.glVertex3f(0f,-1f,0f);
    gl.glEnd();
     */
	
}

@Override
public void dispose(GLAutoDrawable arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void init(GLAutoDrawable arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
	// TODO Auto-generated method stubfinal
    GL2 gl = arg0.getGL().getGL2();
    if(arg4 <= 0)
    	arg4 = 1;
			
    final float h = (float) arg3 / (float) arg4;
    gl.glViewport(0, 0, arg3, arg4);
    gl.glMatrixMode(GL2.GL_PROJECTION);
    gl.glLoadIdentity();
		
    glu.gluPerspective(45.0f, h, 1.0, 20.0);
    gl.glMatrixMode(GL2.GL_MODELVIEW);
    gl.glLoadIdentity();
	
}
	
}//end of class