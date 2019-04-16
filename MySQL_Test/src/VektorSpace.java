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
	      gl.glVertex3f(-0.75f,0f,0);
	      gl.glVertex3f(0f,-0.75f, 0);

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

	      gl.glVertex3f(-0.75f,0f,3f);
	      gl.glVertex3f(0f,-0.75f,3f);
	      gl.glVertex3f(-0.75f,0f,0);
	      gl.glVertex3f(-0.75f,0f,3f);
	      gl.glVertex3f(0f,-0.75f, 0);
	      gl.glVertex3f(0f,-0.75f,3f);
	      gl.glEnd();

	      
		
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
		
		
	}

}
