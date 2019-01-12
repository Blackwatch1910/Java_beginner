import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextArea;

//<applet code ="bc1.class" height = 400 width = 400></applet>

public class bc1 extends Applet {

  java.awt.TextArea display = new java.awt.TextArea(1, 80);

  int paintCount = 0;

  String newline;

  public void init() {
    //Create the text area and make it uneditable.
    display = new TextArea(1, 80);
    display.setEditable(false);

    //Set the layout manager so that the text area
    //will be as wide as possible.
    setLayout(new java.awt.GridLayout(1, 0));

    //Add the text area to the applet.
    add(display);

    //Find the platform-dependent newline character.
    newline = System.getProperty("line.separator");

    addItem("init: " + threadInfo(Thread.currentThread()));
  }

  public void start() {
    addItem("start: " + threadInfo(Thread.currentThread()));
  }

  public void stop() {
    addItem("stop: " + threadInfo(Thread.currentThread()));
  }

  public void destroy() {
    addItem("destroy: " + threadInfo(Thread.currentThread()));
    //removeAll(); //XXXAppletViewer allows 2 init calls.
  }

  String threadInfo(Thread t) {
    return "thread=" + t.getName() + ", " + "thread group="
        + t.getThreadGroup().getName();
  }

  void addItem(String newWord) {
    System.out.println(newWord);
    display.append(newWord + newline);
    display.repaint();
    //A hack to get the applet update() method called
    //occasionally:
    if (++paintCount % 4 == 0) {
      repaint();
    }
  }

  public void update(Graphics g) {
    addItem("update: " + threadInfo(Thread.currentThread()));
    super.update(g);
  }
}
