import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;

public class VektorSpace implements GLEventListener{
	GLU glu = new GLU();

	public static void main(String[] args) {
		GLProfile prof = GLProfile.get(GLProfile.GL2);
		GLCapabilities cap = new GLCapabilities(prof);
		
		GLCanvas canvas = new GLCanvas(cap);
		VektorSpace vs = new VektorSpace();
		canvas.addGLEventListener(vs);
		canvas.setSize(800,800);
		
		JFrame frame = new JFrame("lmao");
		
		frame.getContentPane().add(canvas);
		frame.setSize(frame.getContentPane().getPreferredSize());
		frame.setVisible(true);

	}

	@Override
	public void display(GLAutoDrawable arg0) {
		final GL2 gl = arg0.getGL().getGL2();
		gl.glTranslatef(0f, 0f, -2.5f);
		
		gl.glBegin(GL2.GL_LINES);
	      gl.glVertex3f(0f,0f,0f);
	      gl.glVertex3f(1f,0f, 1f);
	      gl.glEnd();
	      
	      //3d line
	      
	      //3 units in to the window
	      /*gl.glVertex3f(0f,0f,3f);
	      gl.glVertex3f(0f,-1f,3f);
	      gl.glVertex3f(0f,-1f,3f);
	      gl.glVertex3f(1f,0f,3f);
	      gl.glVertex3f(1f,0f,3f);
	      gl.glVertex3f(0f,0f,3f);
	      gl.glEnd();*/
	      //top

	     

	      
		
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

}
