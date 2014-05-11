package application;
	
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Scene scene = new Scene(root,420,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
			Rectangle kast= new Rectangle(405,100);
			root.getChildren().add(kast);
			kast.setFill(Color.GRAY);
			
			Rectangle a= new Rectangle(10,10,10,20);
			a.setFill(Color.BLUEVIOLET);
			root.getChildren().add(a);


			Rectangle b= new Rectangle(25,10,10,20);
			b.setFill(Color.BLUEVIOLET);
			root.getChildren().add(b);
			

			Rectangle c= new Rectangle(40,10,10,20);
			c.setFill(Color.BLUEVIOLET);
			root.getChildren().add(c);

			Rectangle d= new Rectangle(55,10,10,20);
			d.setFill(Color.BLUEVIOLET);
			root.getChildren().add(d);

			Rectangle e= new Rectangle(70,10,10,20);
			e.setFill(Color.BLUEVIOLET);
			root.getChildren().add(e);

			Rectangle f= new Rectangle(85,10,10,20);
			f.setFill(Color.BLUEVIOLET);
			root.getChildren().add(f);

			Rectangle g= new Rectangle(100,10,10,20);
			g.setFill(Color.BLUEVIOLET);
			root.getChildren().add(g);

			Rectangle h= new Rectangle(115,10,10,20);
			h.setFill(Color.BLUEVIOLET);
			root.getChildren().add(h);

			Rectangle i= new Rectangle(130,10,10,20);
			i.setFill(Color.BLUEVIOLET);
			root.getChildren().add(i);

			Rectangle j= new Rectangle(145,10,10,20);
			j.setFill(Color.BLUEVIOLET);
			root.getChildren().add(j);

			Rectangle k= new Rectangle(160,10,10,20);
			k.setFill(Color.BLUEVIOLET);
			root.getChildren().add(k);

			Rectangle l= new Rectangle(175,10,10,20);
			l.setFill(Color.BLUEVIOLET);
			root.getChildren().add(l);

			Rectangle m= new Rectangle(190,10,10,20);
			m.setFill(Color.BLUEVIOLET);
			root.getChildren().add(m);

			Rectangle n= new Rectangle(205,10,10,20);
			n.setFill(Color.BLUEVIOLET);
			root.getChildren().add(n);

			Rectangle o= new Rectangle(220,10,10,20);
			o.setFill(Color.BLUEVIOLET);
			root.getChildren().add(o);

			Rectangle p= new Rectangle(235,10,10,20);
			p.setFill(Color.BLUEVIOLET);
			root.getChildren().add(p);

			Rectangle q= new Rectangle(250,10,10,20);
			q.setFill(Color.BLUEVIOLET);
			root.getChildren().add(q);

			Rectangle r= new Rectangle(265,10,10,20);
			r.setFill(Color.BLUEVIOLET);
			root.getChildren().add(r);

			Rectangle s= new Rectangle(280,10,10,20);
			s.setFill(Color.BLUEVIOLET);
			root.getChildren().add(s);

			Rectangle t= new Rectangle(295,10,10,20);
			t.setFill(Color.BLUEVIOLET);
			root.getChildren().add(t);

			Rectangle u= new Rectangle(310,10,10,20);
			u.setFill(Color.BLUEVIOLET);
			root.getChildren().add(u);

			Rectangle v= new Rectangle(325,10,10,20);
			v.setFill(Color.BLUEVIOLET);
			root.getChildren().add(v);

			Rectangle w= new Rectangle(340,10,10,20);
			w.setFill(Color.BLUEVIOLET);
			root.getChildren().add(w);

			Rectangle x= new Rectangle(355,10,10,20);
			x.setFill(Color.BLUEVIOLET);
			root.getChildren().add(x);

			Rectangle y= new Rectangle(370,10,10,20);
			y.setFill(Color.BLUEVIOLET);
			root.getChildren().add(y);

			Rectangle z= new Rectangle(385,10,10,20);
			z.setFill(Color.BLUEVIOLET);
			root.getChildren().add(z);

			//ALUMINE KASTIRIDA
			
			
			Rectangle astatic= new Rectangle(10,70,10,20);
			astatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(astatic);


			Rectangle bstatic= new Rectangle(25,70,10,20);
			bstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(bstatic);
			

			Rectangle cstatic= new Rectangle(40,70,10,20);
			cstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(cstatic);

			Rectangle dstatic= new Rectangle(55,70,10,20);
			dstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(dstatic);

			Rectangle estatic= new Rectangle(70,70,10,20);
			estatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(estatic);

			Rectangle fstatic= new Rectangle(85,70,10,20);
			fstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(fstatic);

			Rectangle gstatic= new Rectangle(100,70,10,20);
			gstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(gstatic);

			Rectangle hstatic= new Rectangle(115,70,10,20);
			hstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(hstatic);

			Rectangle istatic= new Rectangle(130,70,10,20);
			istatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(istatic);

			Rectangle jstatic= new Rectangle(145,70,10,20);
			jstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(jstatic);

			Rectangle kstatic= new Rectangle(160,70,10,20);
			kstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(kstatic);

			Rectangle lstatic= new Rectangle(175,70,10,20);
			lstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(lstatic);

			Rectangle mstatic= new Rectangle(190,70,10,20);
			mstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(mstatic);

			Rectangle nstatic= new Rectangle(205,70,10,20);
			nstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(nstatic);

			Rectangle ostatic= new Rectangle(220,70,10,20);
			ostatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(ostatic);

			Rectangle pstatic= new Rectangle(235,70,10,20);
			pstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(pstatic);

			Rectangle qstatic= new Rectangle(250,70,10,20);
			qstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(qstatic);

			Rectangle rstatic= new Rectangle(265,70,10,20);
			rstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(rstatic);

			Rectangle sstatic= new Rectangle(280,70,10,20);
			sstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(sstatic);

			Rectangle tstatic= new Rectangle(295,70,10,20);
			tstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(tstatic);

			Rectangle ustatic= new Rectangle(310,70,10,20);
			ustatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(ustatic);

			Rectangle vstatic= new Rectangle(325,70,10,20);
			vstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(vstatic);

			Rectangle wstatic= new Rectangle(340,70,10,20);
			wstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(wstatic);

			Rectangle xstatic= new Rectangle(355,70,10,20);
			xstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(xstatic);

			Rectangle ystatic= new Rectangle(370,70,10,20);
			ystatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(ystatic);

			Rectangle zstatic= new Rectangle(385,70,10,20);
			zstatic.setFill(Color.BLUEVIOLET);
			root.getChildren().add(zstatic);
			
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
