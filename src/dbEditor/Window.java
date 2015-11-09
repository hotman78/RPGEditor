package dbEditor;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;
import static processing.core.PApplet.println;
import processing.data.XML;
public class Window extends JFrame  implements ActionListener, ListSelectionListener{

    public Window() {
        initComponents();
        run();
    }
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel4 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    type = new javax.swing.JList(typeModel);
    jPanel3 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jScrollPane2 = new javax.swing.JScrollPane();
    data =  new javax.swing.JList(dataModel);
    jTextField3 = new javax.swing.JScrollPane();
    item = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("タイプ"));
    jPanel4.setPreferredSize(new java.awt.Dimension(120, 250));

    jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    type.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    type.addListSelectionListener(this);
    jScrollPane1.setViewportView(type);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
    );

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("データ"));
    jPanel3.setPreferredSize(new java.awt.Dimension(120, 250));

    jLabel1.setText("ID");

    jTextField1.setText("ここにIDが入るぜ");
    jTextField1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jTextField1ActionPerformed(evt);
      }
    });

    jScrollPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    data.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    data.addListSelectionListener(this);
    jScrollPane2.setViewportView(data);

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
      .addComponent(jScrollPane2)
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel1))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout itemLayout = new javax.swing.GroupLayout(item);
    item.setLayout(itemLayout);
    itemLayout.setHorizontalGroup(
      itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 270, Short.MAX_VALUE)
    );
    itemLayout.setVerticalGroup(
      itemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 248, Short.MAX_VALUE)
    );

    item.setLayout(new BoxLayout(item, BoxLayout.PAGE_AXIS));

    jTextField3.setViewportView(item);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jTextField3)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap(40, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                System.out.println("windowを生成しました");
                new Window().setVisible(true);
            }
        });
    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JList data;
  private javax.swing.JPanel item;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JScrollPane jTextField3;
  private javax.swing.JList type;
  // End of variables declaration//GEN-END:variables

  DefaultListModel typeModel = new DefaultListModel();
  DefaultListModel dataModel = new DefaultListModel();
  XML xml = loadXML("./data/DataBase.xml");
  @SuppressWarnings("ConvertToTryWithResources")
  
  private void run(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    type();
    type.setSelectedIndex(0);
    data(0);
    data.setSelectedIndex(0);
    item(0,0);
  }
  private void type() {
    typeModel.removeAllElements();
    XML[] typeList = xml.getChild("CDB").getChildren("type");
    for(int i=0;i<typeList.length;i++){
      typeModel.addElement(i+":"+typeList[i].getString("value"));
    }
  }
  
  private void data(int index) {
    dataModel.removeAllElements();
    XML[] dataList = xml.getChild("CDB").getChildren("type")[index].getChildren("data");
    for(int i=0;i<dataList.length;i++){
      dataModel.addElement(i+":"+dataList[i].getString("value"));
    }
  }
  private void item(int typeNum,int dataNum){
    XML[] itemList = xml.getChild("CDB").getChildren("type")[typeNum].getChildren("data")[dataNum].getChildren("item");
    item.removeAll();
    for(int i=0;i<itemList.length;i++){
    /*  if(null != itemList[i].getString("kind"))switch (itemList[i].getString("kind")) {
        case "String":
          JTextField field =new JTextField();
          field.setText(itemList[i].getContent());
          field.setMaximumSize(new Dimension(Short.MAX_VALUE, 30));
          item.add(field);
          field.setVisible(true);
          break;
        case "int":
          JSpinner  spinner =new JSpinner ();
          spinner.setValue((Integer.parseInt(itemList[i].getContent())));
          spinner.setMaximumSize(new Dimension(Short.MAX_VALUE, 30));
          item.add(spinner);
          spinner.setVisible(true);          
          break;
      }*/
    }
  }
  
  
  XML loadXML(String path){    
    try{
      StringBuilder buf = new StringBuilder();
      File file = new File(path);
      BufferedReader br = new BufferedReader(new FileReader(file));
      String str;
      while(true){
        str = br.readLine();
        if(str==null)break;
        buf.append(str);
      }
      br.close();
      return XML.parse(buf.toString());
      }catch (ParserConfigurationException e) {
        System.out.println(e);
      }catch (SAXException e) {
        System.out.println(e);
      }catch(FileNotFoundException e){
        System.out.println(e);
      }catch(IOException e){
        System.out.println(e);
      }
    return null;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    Object obj = e.getSource();
    //if(obj ==type)println("aa");
  }

  @Override
  public void valueChanged(ListSelectionEvent e) {
    Object obj = e.getSource();
    if(e.getValueIsAdjusting())return;
      if(obj ==type){
        data(type.getSelectedIndex());
        if(dataModel.getSize()==0)dataModel.addElement("0:");
      }
    if(obj ==data){
      println("a");
      item(type.getSelectedIndex(),data.getSelectedIndex());
    }
  }
}