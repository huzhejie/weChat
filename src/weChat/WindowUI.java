package weChat;

import Models.TipRecord;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch14_combox.BEComboBoxUI;
import org.jb2011.lnf.beautyeye.ch2_tab.BETabbedPaneUI;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import org.jb2011.lnf.beautyeye.ch6_textcoms.BEPasswordFieldUI;
import org.jb2011.lnf.beautyeye.ch6_textcoms.BETextAreaUI;
import org.jb2011.lnf.beautyeye.ch6_textcoms.BETextFieldUI;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by huzhejie on 2016/8/5.
 */
public class WindowUI {
    /**
     * 界面和按钮的元素.依次为
     * 窗口
     * 主功能按钮
     * 主面板
     * 滚动条
     * 存放主功能按钮的小面板
     * T人和邀请人的选择列表
     */

    private static JFrame mainFrame = null;
    private static JFrame chatIn = null;
    private static JFrame dailyTip = null;
    private static JFrame wordModify = null;
    private static JFrame chooseGroup = null;
    private static JFrame groupInvite = null;
    private static JFrame groupRemove = null;
    private static JFrame setFrame = null;
    private static JFrame loginFrame = null;
    private static JButton chatJButton = new JButton(new ImageIcon(WindowUI.class.getResource("resource/chat.png")));
    private static JButton addFriend = new JButton(new ImageIcon(WindowUI.class.getResource("resource/add_friend.png")));
    private static JButton signRecord = new JButton(new ImageIcon(WindowUI.class.getResource("resource/sign_record.png")));
    private static JButton autoChat = new JButton(new ImageIcon(WindowUI.class.getResource("resource/auto_chat.png")));
    private static JButton reply = new JButton(new ImageIcon(WindowUI.class.getResource("resource/reply.png")));
    private static JButton warn = new JButton(new ImageIcon(WindowUI.class.getResource("resource/warn.png")));
    private static JButton localWord = new JButton(new ImageIcon(WindowUI.class.getResource("resource/local_word.png")));
    private static JButton set = new JButton(new ImageIcon(WindowUI.class.getResource("resource/set.png")));
    private static JButton showGroupList = new JButton(new ImageIcon(WindowUI.class.getResource("resource/chat.png")));
    private static JButton inviteIntoGroup = new JButton(new ImageIcon(WindowUI.class.getResource("resource/reply.png")));
    private static JButton removeFromGroup = new JButton(new ImageIcon(WindowUI.class.getResource("resource/warn.png")));
    private static JButton sendByTime = new JButton(new ImageIcon(WindowUI.class.getResource("resource/send_by_time.png")));
    private static JButton publicWord = new JButton(new ImageIcon(WindowUI.class.getResource("resource/send_by_time.png")));
    private static JButton privateWord = new JButton(new ImageIcon(WindowUI.class.getResource("resource/send_by_time.png")));
    private static JButton senseWord = new JButton(new ImageIcon(WindowUI.class.getResource("resource/send_by_time.png")));
    private static JPanel userInfoJPanel = new JPanel();
    private static JPanel jPanel = new JPanel();
    private static JPanel chatJPanel = new JPanel();
    private static JPanel tipTimePanel = new JPanel();
    private static JPanel tipPeriodPanel = new JPanel();
    private static JPanel addTimeTipPanel = new JPanel();
    private static JPanel addPeriodTipPanel = new JPanel();
    private static JPanel propertyTimePanel = new JPanel();
    private static JPanel propertyPeriodPanel = new JPanel();
    private static JPanel wordPanel = new JPanel();
    private static JPanel showGroupPanel = new JPanel();
    private static JPanel invitePanel = new JPanel();
    private static JPanel removePanel = new JPanel();
    private static JPanel loginPanel  = new JPanel();
    private static JTabbedPane setTipPanel = new JTabbedPane(JTabbedPane.TOP);
    private static JPanel emptyTipPanel = new JPanel();
    private static JPanel setTimePanel = new JPanel();//定时发布面板
    private static JPanel setPeriodPanel = new JPanel();//周期发布面板
    private static JTabbedPane setPanel = new JTabbedPane(JTabbedPane.LEFT);
    private static JPanel emptyPanel = new JPanel();
    private static JPanel setGroupNamePanel = new JPanel();
    private static JPanel setTuLingAPIPanel = new JPanel();
    private static JScrollPane jScrollPane;
    private static JScrollPane tipTimeJScrollPane;
    private static JScrollPane tipPeriodJScrollPane;
    private static JScrollPane setGroupNameJScrollPane;
    private static JScrollPane inviteScrollPane1;
    private static JScrollPane inviteScrollPane2;
    private static JScrollPane removeScrollPane1;
    private static JScrollPane removeScrollPane2;
    private static JLabel tuLing = new JLabel("图灵机器人 key:");//存放图灵key
    private static JLabel userNameLabel = new JLabel();//存放用户名字
    private static JLabel userHeaderImg = new JLabel();//存放用户头像
    private static JLabel robotUserName = new JLabel("用户名：");
    private static JLabel robotUserPasswd = new JLabel("密码：");
    private static JLabel jLabel_0 = new JLabel();//存放二维码
    private static JPanel jPanel_1 = new JPanel();//存放检查群消息按钮
    private static JPanel jPanel_2 = new JPanel();//好友自动通过
    private static JPanel jPanel_3 = new JPanel();//存放查看签到记录的按钮
    private static JPanel jPanel_4 = new JPanel();//存放智能聊天的按钮
    private static JPanel jPanel_5 = new JPanel();//存放自动回复功能的按钮
    private static JPanel jPanel_6 = new JPanel();//存放敏感警告功能的按钮
    private static JPanel jPanel_7 = new JPanel();//存放本地词库功能的按钮
    private static JPanel jPanel_8 = new JPanel();//存放设置功能的按钮
    private static JPanel jPanel_9 = new JPanel();//存放消息定时发送功能的按钮
    private static JPanel jPanel_10 = new JPanel();//存放显示群列表的功能的按钮
    private static JPanel jPanel_11 = new JPanel();//存放邀请进群
    private static JPanel jPanel_12 = new JPanel();//存放T人出群
    private static JPanel publicPanel = new JPanel();
    private static JPanel privatePanel = new JPanel();
    private static JPanel sensePanel = new JPanel();
    private static JList jList1 = null;
    private static JList jList2 = null;
    private static JList jList3 =null;
    private static JList jList4 = null;
    private static JTextPane jTextPane = new JTextPane();
    private static JTextField timeArea = new JTextField(10);//定时发送的时间
    private static JTextField periodStartTime = new JTextField(10);//间隔发布的开始时间
    private static JTextField periodTime = new JTextField(5);//间隔发布的间隔时间
    private static JTextArea propertyTimeArea = new JTextArea();//定时发送的内容
    private static JTextArea propertyPeriodArea = new JTextArea();//间隔发布的内容
    private static JTextArea tulingKeyArea = new JTextArea();//存放图灵key
    private static JTextField userNameArea = new JTextField();//输入机器人的用户名
    private static JPasswordField userPasswdArea = new JPasswordField();//输入机器人的密码
    private static JTextArea searchInviteUser = new JTextArea();//搜索用户的搜索输入框
    private static JTextArea searchInviteGroup = new JTextArea();//搜索群组的搜索输入框
    private static JTextArea searchRemoveUser = new JTextArea();//搜索用户的搜索输入框
    private static JTextArea searchRemoveGroup = new JTextArea();//搜索群组的搜索输入框
    private static JComboBox groupNameArea = new JComboBox();//定时发送中选择群名的选择框
    private static JComboBox groupNamePeriodArea = new JComboBox();//间隔发布中选择群名
    private static JButton addTipTimeButton = new JButton("添加");
    private static JButton addTipPeriodButton = new JButton("添加");
    private static JButton saveRecord = new JButton("保存消息到本地");
    private static JButton seeRecord = new JButton("查看本地消息");
    private static JButton remove = new JButton("踢出该群");
    private static JButton invite = new JButton("邀请进群");
    private static JButton login = new JButton("立即登录");
    private static JButton synchronization  = new JButton("同步数据");
    private static JButton log = new JButton("登录");
    private static JButton register = new JButton("注册");
    private static JButton modifyTulingKey = new JButton("修改");
    private static SimpleAttributeSet attributeSet = new SimpleAttributeSet();
    private static GridBagConstraints gb = new GridBagConstraints();
    private static SimpleDateFormat df = new SimpleDateFormat("HH:mm");

    /**
     * 初始化窗口及组件
     */
    public WindowUI() {
        try {
            BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
            BeautyEyeLNFHelper.launchBeautyEyeLNF();
            UIManager.put("RootPane.setupButtonVisible", false);
            mainFrame = new JFrame("微信机器人");
            chatIn = new JFrame("微信机器人--消息接收");
            dailyTip = new JFrame("微信机器人--定时消息提醒");
            wordModify = new JFrame("微信机器人--修改词库");
            chooseGroup =new JFrame("微信机器人--群列表");
            groupInvite = new JFrame("微信机器人--邀请进群");
            groupRemove = new JFrame("微信机器人--踢人出群");
            setFrame= new JFrame("微信机器人--设置");
            loginFrame = new JFrame("微信机器人--登录");



            mainFrame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 240, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - 400);
            mainFrame.setVisible(false);
            mainFrame.setResizable(false);
            mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
            mainFrame.setLayout(new GridBagLayout());
            gb.gridx = GridBagConstraints.RELATIVE;
            gb.gridy = GridBagConstraints.RELATIVE;
            gb.ipadx = 0;
            gb.ipady = -30;
            mainFrame.add(jPanel,gb);


            chatIn.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 300, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - 200);
            chatIn.setVisible(false);
            chatIn.setResizable(false);
            chatIn.setDefaultCloseOperation(chatIn.HIDE_ON_CLOSE);
            chatIn.setLayout(new GridBagLayout());
            gb.gridx = GridBagConstraints.RELATIVE;
            gb.gridy = GridBagConstraints.RELATIVE;
            chatIn.setSize(600, 600);


            dailyTip.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 500, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - 300);
            dailyTip.setVisible(false);
            dailyTip.setResizable(false);
            dailyTip.setDefaultCloseOperation(dailyTip.HIDE_ON_CLOSE);
//            dailyTip.setLayout(new GridBagLayout());
            dailyTip.setSize(600, 800);
            emptyTipPanel.setSize(600,800);
            dailyTip.getContentPane().add(emptyTipPanel);
            emptyTipPanel.setLayout(new BorderLayout());
            emptyTipPanel.add(BorderLayout.CENTER,setTipPanel);
            tipTimeJScrollPane = new JScrollPane(tipTimePanel);
            tipTimePanel.setLayout(new GridLayout(0,1));
            tipPeriodJScrollPane = new JScrollPane(tipPeriodPanel);
            tipPeriodPanel.setLayout(new GridLayout(0,1));

            wordModify.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 200, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - 100);
            wordModify.setVisible(false);
            wordModify.setResizable(false);
            wordModify.setDefaultCloseOperation(wordModify.HIDE_ON_CLOSE);
            wordModify.setSize(400, 200);
            wordModify.add(wordPanel);

            chooseGroup.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 100, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - 300);
            chooseGroup.setVisible(false);
            chooseGroup.setResizable(false);
            chooseGroup.setDefaultCloseOperation(chooseGroup.HIDE_ON_CLOSE);
            chooseGroup.add(showGroupPanel);

            groupInvite.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 400, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - 300);
            groupInvite.setVisible(false);
            groupInvite.setResizable(false);
            groupInvite.setLayout(new BorderLayout());
            groupInvite.setDefaultCloseOperation(groupInvite.HIDE_ON_CLOSE);
            groupInvite.setSize(800,700);
            groupInvite.add(BorderLayout.CENTER,invitePanel);
            groupInvite.add(BorderLayout.SOUTH,invite);

            groupRemove.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 400, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - 300);
            groupRemove.setVisible(false);
            groupRemove.setResizable(false);
            groupRemove.setLayout(new BorderLayout());
            groupRemove.setDefaultCloseOperation(groupRemove.HIDE_ON_CLOSE);
            groupRemove.setSize(800,700);
            groupRemove.add(BorderLayout.CENTER,removePanel);
            groupRemove.add(BorderLayout.SOUTH,remove);

            setFrame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 400, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - 300);
            setFrame.setVisible(false);
            setFrame.setResizable(false);
            setFrame.setDefaultCloseOperation(setFrame.HIDE_ON_CLOSE);
            setFrame.setSize(800,700);
            emptyPanel.setSize(800,700);//用来覆盖原先frame的contentPane的全透明效果
            setFrame.getContentPane().add(emptyPanel);
            emptyPanel.setLayout(new BorderLayout());
            emptyPanel.add(BorderLayout.CENTER,setPanel);

            loginFrame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2 - 200, Toolkit.getDefaultToolkit().getScreenSize().height / 2 - 200);
            loginFrame.setVisible(false);
            loginFrame.setResizable(false);
            loginFrame.setDefaultCloseOperation(loginFrame.HIDE_ON_CLOSE);
            loginFrame.setSize(400,350);
            loginFrame.add(loginPanel);

            //主界面按钮的UI设置
            userInfoJPanel.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
            userInfoJPanel.setBackground(Color.lightGray);
            userInfoJPanel.setBorder(BorderFactory.createEmptyBorder(0,20,0,20));
            login.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
            login.setForeground(Color.white);
            synchronization.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.blue));
            synchronization.setForeground(Color.white);
            chatJButton.setBorder(null);
            chatJButton.setFocusPainted(false);
            addFriend.setBorder(null);
            addFriend.setFocusPainted(false);
            signRecord.setBorder(null);
            signRecord.setFocusPainted(false);
            autoChat.setBorder(null);
            autoChat.setFocusPainted(false);
            localWord.setBorder(null);
            localWord.setFocusPainted(false);
            reply.setBorder(null);
            reply.setFocusPainted(false);
            set.setBorder(null);
            set.setFocusPainted(false);
            warn.setBorder(null);
            warn.setFocusPainted(false);
            sendByTime.setBorder(null);
            sendByTime.setFocusPainted(false);
            publicWord.setBorder(null);
            publicWord.setFocusPainted(false);
            privateWord.setBorder(null);
            privateWord.setFocusPainted(false);
            senseWord.setBorder(null);
            senseWord.setFocusPainted(false);
            showGroupList.setBorder(null);
            showGroupList.setFocusPainted(false);
            inviteIntoGroup.setBorder(null);
            inviteIntoGroup.setFocusPainted(false);
            removeFromGroup.setBorder(null);
            removeFromGroup.setFocusPainted(false);
            //主界面的组件设置
            jPanel.setLayout(new GridLayout());
            jPanel_1.setLayout(new GridLayout(2, 1));
            jPanel_1.add(chatJButton);
            JLabel j1 = new JLabel("消息盒子");
            j1.setFont(new Font("黑体", 1, 16));
            jPanel_1.add(j1);
            jPanel_2.setBorder(null);
            jPanel_2.setLayout(new GridLayout(2, 1));
            jPanel_2.add(addFriend);
            JLabel j2 = new JLabel("自动通过");
            j2.setFont(new Font("黑体", 1, 16));
            jPanel_2.add(j2);
            jPanel_3.setBorder(null);
            jPanel_3.setLayout(new GridLayout(2, 1));
            jPanel_3.add(signRecord);
            JLabel j3 = new JLabel("签到记录");
            j3.setFont(new Font("黑体",1,16));
            jPanel_3.add(j3);
            jPanel_4.setBorder(null);
            jPanel_4.setLayout(new GridLayout(2, 1));
            jPanel_4.add(autoChat);
            JLabel j4 = new JLabel("智能聊天");
            j4.setFont(new Font("黑体",1,16));
            jPanel_4.add(j4);
            jPanel_5.setBorder(null);
            jPanel_5.setLayout(new GridLayout(2, 1));
            jPanel_5.add(reply);
            JLabel j5 = new JLabel("自动回复");
            j5.setFont(new Font("黑体",1,16));
            jPanel_5.add(j5);
            jPanel_6.setBorder(null);
            jPanel_6.setLayout(new GridLayout(2, 1));
            jPanel_6.add(warn);
            JLabel j6 = new JLabel("敏感警告");
            j6.setFont(new Font("黑体",1,16));
            jPanel_6.add(j6);
            jPanel_7.setBorder(null);
            jPanel_7.setLayout(new GridLayout(2, 1));
            jPanel_7.add(localWord);
            JLabel j7 = new JLabel("本地词库");
            j7.setFont(new Font("黑体",1,16));
            jPanel_7.add(j7);
            jPanel_8.setBorder(null);
            jPanel_8.setLayout(new GridLayout(2, 1));
            jPanel_8.add(set);
            JLabel j8 = new JLabel("设    置");
            j8.setFont(new Font("黑体",1,16));
            jPanel_8.add(j8);
            jPanel_9.setBorder(null);
            jPanel_9.setLayout(new GridLayout(2, 1));
            jPanel_9.add(sendByTime);
            JLabel j9 = new JLabel("定时发送");
            j9.setFont(new Font("黑体",1,16));
            jPanel_9.add(j9);
            jPanel_10.setBorder(null);
            jPanel_10.setLayout(new GridLayout(2,1));
            jPanel_10.add(showGroupList);
            JLabel j10 = new JLabel("群组列表");
            j10.setFont(new Font("黑体",1,16));
            jPanel_10.add(j10);
            jPanel_11.setBorder(null);
            jPanel_11.setLayout(new GridLayout(2,1));
            jPanel_11.add(inviteIntoGroup);
            JLabel j11 = new JLabel("邀请进群");
            j11.setFont(new Font("黑体",1,16));
            jPanel_11.add(j11);
            jPanel_12.setBorder(null);
            jPanel_12.setLayout(new GridLayout(2,1));
            jPanel_12.add(removeFromGroup);
            JLabel j12 = new JLabel("踢人出群");
            j12.setFont(new Font("黑体",1,16));
            jPanel_12.add(j12);

            //消息盒子的组件设置
            saveRecord.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
            seeRecord.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
            saveRecord.setForeground(Color.white);
            seeRecord.setForeground(Color.white);
            chatJPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
            chatJPanel.add(saveRecord);
            chatJPanel.add(seeRecord);
            jTextPane.setFocusable(true);
            jTextPane.setEditable(false);
            jScrollPane = new JScrollPane(jTextPane);
            StyleConstants.setFontSize(attributeSet,16);
            jScrollPane.setHorizontalScrollBarPolicy(
                    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            jScrollPane.setVerticalScrollBarPolicy(
                    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            gb.gridx=0;
            gb.ipady = 500;
            gb.ipadx = 520;
            gb.gridy=GridBagConstraints.RELATIVE;
            gb.gridwidth=GridBagConstraints.REMAINDER;
            chatIn.add(jScrollPane,gb);
            gb.ipady = 100;
            gb.ipadx = 300;
            gb.gridheight = 3;
            chatIn.add(chatJPanel,gb);

            //定时发布的组件设置
            setTimePanel.setLayout(new GridBagLayout());
            setPeriodPanel.setLayout(new GridBagLayout());
            addTimeTipPanel.setLayout(new GridLayout(0,2, 20, 10));
            addPeriodTipPanel.setLayout(new GridLayout(0,2,20,10));
            addTimeTipPanel.setBorder(BorderFactory.createEmptyBorder(20,0,20,0));
            addPeriodTipPanel.setBorder(BorderFactory.createEmptyBorder(20,0,20,0));
            propertyTimePanel.setLayout(new FlowLayout(FlowLayout.LEFT,40,0));
            propertyTimePanel.setBorder(BorderFactory.createEmptyBorder(0,0,20,0));
            propertyPeriodPanel.setLayout(new FlowLayout(FlowLayout.LEFT,40,0));
            propertyPeriodPanel.setBorder(BorderFactory.createEmptyBorder(0,0,20,0));
            timeArea.setSize(120, 80);
            timeArea.setUI(new BETextFieldUI());
            periodStartTime.setSize(100,80);
            periodStartTime.setUI(new BETextFieldUI());
            periodTime.setSize(50,80);
            periodTime.setUI(new BETextFieldUI());
            propertyTimeArea.setSize(250, 80);
            propertyTimeArea.setLineWrap(true);
            propertyTimeArea.setRows(3);
            propertyTimeArea.setUI(new BETextAreaUI());
            propertyPeriodArea.setSize(250,80);
            propertyPeriodArea.setLineWrap(true);
            propertyPeriodArea.setRows(3);
            propertyPeriodArea.setUI(new BETextAreaUI());
            groupNameArea.setSize(100,80);
            groupNameArea.setUI(new BEComboBoxUI());
            groupNamePeriodArea.setSize(100,80);
            groupNamePeriodArea.setUI(new BEComboBoxUI());
            JLabel time = new JLabel("指定时间(HH:SS):");
            JLabel startTime = new JLabel("开始时间(HH:SS):");
            JLabel period = new JLabel("周期(按小时计):");
            JLabel groupName_1 = new JLabel("群名:");
            JLabel groupName_2 = new JLabel("群名:");
            JLabel property_1 = new JLabel("发布内容(文字):");
            JLabel property_2 = new JLabel("发布内容(文字):");
            addTimeTipPanel.add(time);
            addTimeTipPanel.add(timeArea);
            addTimeTipPanel.add(groupName_1);
            addTimeTipPanel.add(groupNameArea);
            addPeriodTipPanel.add(startTime);
            addPeriodTipPanel.add(periodStartTime);
            addPeriodTipPanel.add(period);
            addPeriodTipPanel.add(periodTime);
            addPeriodTipPanel.add(groupName_2);
            addPeriodTipPanel.add(groupNamePeriodArea);
            propertyTimePanel.add(property_1);
            propertyTimePanel.add(propertyTimeArea);
            propertyTimePanel.add(addTipTimeButton);
            propertyPeriodPanel.add(property_2);
            propertyPeriodPanel.add(propertyPeriodArea);
            propertyPeriodPanel.add(addTipPeriodButton);
            tipTimeJScrollPane.setHorizontalScrollBarPolicy(
                    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            tipTimeJScrollPane.setVerticalScrollBarPolicy(
                    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            tipPeriodJScrollPane.setHorizontalScrollBarPolicy(
                    JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            tipPeriodJScrollPane.setVerticalScrollBarPolicy(
                    JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            addTipTimeButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
            addTipPeriodButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.ipady = 40;
            gbc.ipadx = 250;
            setTimePanel.add(addTimeTipPanel,gbc);
            gbc.ipady = 60;
            setPeriodPanel.add(addPeriodTipPanel,gbc);
            gbc.gridy = 1;
            gbc.ipady = 20;
            gbc.ipadx = 330;
            setTimePanel.add(propertyTimePanel,gbc);
            setPeriodPanel.add(propertyPeriodPanel,gbc);
            gbc.gridy = 2;
            gbc.ipady = 430;
            gbc.ipadx= 510;
            setTimePanel.add(tipTimeJScrollPane,gbc);
            gbc.ipady = 375;
            setPeriodPanel.add(tipPeriodJScrollPane,gbc);
            setTipPanel.setUI(new BETabbedPaneUI());
            setTipPanel.add("定时发布",setTimePanel);
            setTipPanel.add("间隔发布",setPeriodPanel);



            wordPanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,30));
            publicPanel.setLayout(new GridLayout(2,1));
            JLabel publicLabel = new JLabel("公开词库");
            publicLabel.setFont(new Font("黑体",1,16));
            publicPanel.add(publicWord);
            publicPanel.add(publicLabel);
            JLabel privateLabel = new JLabel("私密词库");
            privateLabel.setFont(new Font("黑体",1,16));
            privatePanel.setLayout(new GridLayout(2,1));
            privatePanel.add(privateWord);
            privatePanel.add(privateLabel);
            JLabel senseLabel = new JLabel("敏感词库");
            senseLabel.setFont(new Font("黑体",1,16));
            sensePanel.setLayout(new GridLayout(2,1));
            sensePanel.add(senseWord);
            sensePanel.add(senseLabel);
            wordPanel.add(publicPanel);
            wordPanel.add(privatePanel);
            wordPanel.add(sensePanel);


            showGroupPanel.setLayout(new GridLayout(0,1,20,20));
            showGroupPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

            invitePanel.setLayout(new GridBagLayout());
            invite.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
            invite.setForeground(Color.white);
            searchInviteUser.setBorder(BorderFactory.createTitledBorder("搜索用户名"));
            searchInviteUser.setLineWrap(true);
            searchInviteGroup.setBorder(BorderFactory.createTitledBorder("搜索群名"));
            searchInviteGroup.setLineWrap(true);
            searchInviteUser.setSize(365,100);
            searchInviteGroup.setSize(365,100);
            jList1 = new JList();



            removePanel.setLayout(new GridBagLayout());
            remove.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
            remove.setForeground(Color.white);
            searchRemoveUser.setBorder(BorderFactory.createTitledBorder("搜索用户名"));
            searchRemoveUser.setLineWrap(true);
            searchRemoveGroup.setBorder(BorderFactory.createTitledBorder("搜索群名"));
            searchRemoveGroup.setLineWrap(true);
            searchRemoveUser.setSize(365,100);
            searchRemoveGroup.setSize(365,100);
            jList4 = new JList();

            setGroupNamePanel.setLayout(new GridLayout(0,3,20,20));
            setTuLingAPIPanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,50));
            modifyTulingKey.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
            modifyTulingKey.setForeground(Color.white);
//            setGroupNamePanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
            setGroupNameJScrollPane = new JScrollPane(setGroupNamePanel);
            tuLing.setFont(new Font("黑体",1,16));
            tulingKeyArea.setLineWrap(true);
            tulingKeyArea.setBorder(BorderFactory.createTitledBorder("由小写英文字母与0到9的数字共32位组成"));
            tulingKeyArea.setSize(350,100);
            setTuLingAPIPanel.add(tuLing);
            setTuLingAPIPanel.add(tulingKeyArea);
            setTuLingAPIPanel.add(modifyTulingKey);
            setPanel.setUI(new BETabbedPaneUI());
            setPanel.add("修改群名",setGroupNameJScrollPane);
            setPanel.add("修改图灵key",setTuLingAPIPanel);

            log.setSize(100,100);
            log.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
            log.setForeground(Color.white);
            register.setSize(100,100);
            register.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
            register.setForeground(Color.white);
            loginPanel.setLayout(new FlowLayout(FlowLayout.CENTER,50,30));
            userNameArea.setUI(new BETextFieldUI());
            userNameArea.setSize(300,150);
            userNameArea.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(0,0,0,0),"用户名:"));
            userNameArea.setColumns(40);
            loginPanel.add(userNameArea);
            userPasswdArea.setUI(new BEPasswordFieldUI());
            userPasswdArea.setSize(300,150);
            userPasswdArea.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(0,0,0,0),"密码:"));
            userPasswdArea.setColumns(40);
            loginPanel.add(userPasswdArea);
            loginPanel.add(log);
            loginPanel.add(register);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 添加定时指定发布消息记录的组件
     *
     * @param tipRecord
     *
     **/
    public static void addTimeTip(final TipRecord tipRecord) {
        JButton deleteButton = new JButton("删除");
        deleteButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
        JLabel record = new JLabel();
        final JPanel totalRecord = new JPanel();
        totalRecord.setSize(400,100);
        totalRecord.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        try{
            record.setText("时间：" + df.format(df.parse(timeArea.getText())) + "   群："+groupNameArea.getSelectedItem().toString()+"   内容: " + propertyTimeArea.getText());
            totalRecord.add(record);
            totalRecord.add(deleteButton);
            deleteButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Iterator iterator = Main.getTipRecordList().iterator();
                    while(iterator.hasNext()){
                        TipRecord tipRecord1 = (TipRecord)iterator.next();
                        if(tipRecord.equals(tipRecord1)){
                            iterator.remove();
                        }
                    }
                    tipTimePanel.remove(totalRecord);
                    tipTimePanel.validate();
                    tipTimePanel.repaint();
                }
            });
            tipTimePanel.add(totalRecord);
            tipTimePanel.validate();
            tipTimePanel.repaint();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "错误：输入时间格式不正确", "错误", JOptionPane.ERROR_MESSAGE);
        }

    }

    /**
     *添加间隔时间指定发布消息记录的组件
     * @return
     */
   public static void addPeriodTip(final TipRecord tipRecord){
       JButton deleteButton = new JButton("删除");
       deleteButton.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));
       JLabel record = new JLabel();
       final JPanel totalRecord = new JPanel();
       totalRecord.setSize(400,100);
       totalRecord.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
       try{
           record.setText("时间：" + df.format(df.parse(periodStartTime.getText())) + "   每间隔"+periodTime.getText()+"小时"+"   群："+groupNameArea.getSelectedItem().toString()+"   内容: " + propertyTimeArea.getText());
           totalRecord.add(record);
           totalRecord.add(deleteButton);
           deleteButton.addActionListener(new ActionListener() {
               @Override
               public void actionPerformed(ActionEvent e) {
                   Iterator iterator = Main.getTipRecordList().iterator();
                   while(iterator.hasNext()){
                       TipRecord tipRecord1 = (TipRecord)iterator.next();
                       if(tipRecord.equals(tipRecord1)){
                           iterator.remove();
                       }
                   }
                   tipPeriodPanel.remove(totalRecord);
                   tipPeriodPanel.validate();
                   tipPeriodPanel.repaint();
               }
           });
           tipPeriodPanel.add(totalRecord);
           tipTimePanel.validate();
           tipTimePanel.repaint();
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "错误：输入时间格式不正确", "错误", JOptionPane.ERROR_MESSAGE);
       }

   }


    public static SimpleAttributeSet getAttributeSet() {
        return attributeSet;
    }

    public static void setAttributeSet(SimpleAttributeSet attributeSet) {
        WindowUI.attributeSet = attributeSet;
    }

    public static JPanel getjPanel_3() {
        return jPanel_3;
    }

    public static void setjPanel_3(JPanel jPanel_3) {
        WindowUI.jPanel_3 = jPanel_3;
    }


    public static JFrame getChatIn() {
        return chatIn;
    }

    public static void setChatIn(JFrame chatIn) {
        WindowUI.chatIn = chatIn;
    }

    public static JButton getChatJButton() {
        return chatJButton;
    }

    public static void setChatJButton(JButton chatJButton) {
        WindowUI.chatJButton = chatJButton;
    }

    public static JButton getCheckJButton() {
        return addFriend;
    }

    public static void setCheckJButton(JButton checkJButton) {
        WindowUI.addFriend = checkJButton;
    }

    public static JPanel getjPanel() {
        return jPanel;
    }

    public static void setjPanel(JPanel jPanel) {
        WindowUI.jPanel = jPanel;
    }

    public static JPanel getChatJPanel() {
        return chatJPanel;
    }

    public static void setChatJPanel(JPanel chatJPanel) {
        WindowUI.chatJPanel = chatJPanel;
    }

    public static JScrollPane getjScrollPane() {
        return jScrollPane;
    }

    public static void setjScrollPane(JScrollPane jScrollPane) {
        WindowUI.jScrollPane = jScrollPane;
    }

    public static JLabel getjLabel_0() {
        return jLabel_0;
    }

    public static void setjLabel_0(JLabel jLabel_0) {
        WindowUI.jLabel_0 = jLabel_0;
    }

    public static JPanel getjPanel_1() {
        return jPanel_1;
    }

    public static void setjPanel_1(JPanel jPanel_1) {
        WindowUI.jPanel_1 = jPanel_1;
    }

    public static JPanel getjPanel_2() {
        return jPanel_2;
    }

    public static void setjPanel_2(JPanel jPanel_2) {
        WindowUI.jPanel_2 = jPanel_2;
    }

    public static JTextPane getjTextPane() {
        return jTextPane;
    }

    public static void setjTextPane(JTextPane jTextPane) {
        WindowUI.jTextPane = jTextPane;
    }

    public static JButton getThirdJButton() {
        return signRecord;
    }

    public static void setThirdJButton(JButton thirdJButton) {
        WindowUI.signRecord = thirdJButton;
    }

    public static JFrame getDailyTip() {
        return dailyTip;
    }

    public static void setDailyTip(JFrame dailyTip) {
        WindowUI.dailyTip = dailyTip;
    }

    public static JPanel getTipTimePanel() {
        return tipTimePanel;
    }

    public static void setTipTimePanel(JPanel tipTimePanel) {
        WindowUI.tipTimePanel = tipTimePanel;
    }

    public static JScrollPane getTipTimeJScrollPane() {
        return tipTimeJScrollPane;
    }

    public static void setTipTimeJScrollPane(JScrollPane tipTimeJScrollPane) {
        WindowUI.tipTimeJScrollPane = tipTimeJScrollPane;
    }

    public static JButton getAddTipTimeButton() {
        return addTipTimeButton;
    }

    public static void setAddTipTimeButton(JButton addTipTimeButton) {
        WindowUI.addTipTimeButton = addTipTimeButton;
    }

    public static JPanel getAddTimeTipPanel() {
        return addTimeTipPanel;
    }

    public static void setAddTimeTipPanel(JPanel addTimeTipPanel) {
        WindowUI.addTimeTipPanel = addTimeTipPanel;
    }

    public static SimpleDateFormat getDf() {
        return df;
    }

    public static void setDf(SimpleDateFormat df) {
        WindowUI.df = df;
    }

    public static JComboBox getGroupNameArea() {
        return groupNameArea;
    }

    public static void setGroupNameArea(JComboBox groupNameArea) {
        WindowUI.groupNameArea = groupNameArea;
    }

    public static JButton getAddFriend() {
        return addFriend;
    }

    public static void setAddFriend(JButton addFriend) {
        WindowUI.addFriend = addFriend;
    }

    public static JButton getSignRecord() {
        return signRecord;
    }

    public static void setSignRecord(JButton signRecord) {
        WindowUI.signRecord = signRecord;
    }

    public static JButton getAutoChat() {
        return autoChat;
    }

    public static void setAutoChat(JButton autoChat) {
        WindowUI.autoChat = autoChat;
    }

    public static JButton getReply() {
        return reply;
    }

    public static void setReply(JButton reply) {
        WindowUI.reply = reply;
    }

    public static JButton getWarn() {
        return warn;
    }

    public static void setWarn(JButton warn) {
        WindowUI.warn = warn;
    }

    public static JButton getLocalWord() {
        return localWord;
    }

    public static void setLocalWord(JButton localWord) {
        WindowUI.localWord = localWord;
    }

    public static JButton getSet() {
        return set;
    }

    public static void setSet(JButton set) {
        WindowUI.set = set;
    }

    public static JPanel getjPanel_4() {
        return jPanel_4;
    }

    public static void setjPanel_4(JPanel jPanel_4) {
        WindowUI.jPanel_4 = jPanel_4;
    }

    public static JPanel getjPanel_5() {
        return jPanel_5;
    }

    public static void setjPanel_5(JPanel jPanel_5) {
        WindowUI.jPanel_5 = jPanel_5;
    }

    public static JPanel getjPanel_6() {
        return jPanel_6;
    }

    public static void setjPanel_6(JPanel jPanel_6) {
        WindowUI.jPanel_6 = jPanel_6;
    }

    public static JPanel getjPanel_7() {
        return jPanel_7;
    }

    public static void setjPanel_7(JPanel jPanel_7) {
        WindowUI.jPanel_7 = jPanel_7;
    }

    public static JPanel getjPanel_8() {
        return jPanel_8;
    }

    public static void setjPanel_8(JPanel jPanel_8) {
        WindowUI.jPanel_8 = jPanel_8;
    }

    public static JButton getSendByTime() {
        return sendByTime;
    }

    public static void setSendByTime(JButton sendByTime) {
        WindowUI.sendByTime = sendByTime;
    }

    public static JPanel getjPanel_9() {
        return jPanel_9;
    }

    public static void setjPanel_9(JPanel jPanel_9) {
        WindowUI.jPanel_9 = jPanel_9;
    }

    public static JLabel getUserNameLabel() {
        return userNameLabel;
    }

    public static void setUserNameLabel(JLabel userNameLabel) {
        WindowUI.userNameLabel = userNameLabel;
    }

    public static JPanel getUserInfoJPanel() {
        return userInfoJPanel;
    }

    public static void setUserInfoJPanel(JPanel userInfoJPanel) {
        WindowUI.userInfoJPanel = userInfoJPanel;
    }

    public static JLabel getUserHeaderImg() {
        return userHeaderImg;
    }

    public static void setUserHeaderImg(JLabel userHeaderImg) {
        WindowUI.userHeaderImg = userHeaderImg;
    }

    public static GridBagConstraints getGb() {
        return gb;
    }

    public static void setGb(GridBagConstraints gb) {
        WindowUI.gb = gb;
    }

    public static JFrame getMainFrame() {
        return mainFrame;
    }

    public static void setMainFrame(JFrame mainFrame) {
        WindowUI.mainFrame = mainFrame;
    }

    public static JFrame getWordModify() {
        return wordModify;
    }

    public static void setWordModify(JFrame wordModify) {
        WindowUI.wordModify = wordModify;
    }

    public static JButton getPublicWord() {
        return publicWord;
    }

    public static void setPublicWord(JButton publicWord) {
        WindowUI.publicWord = publicWord;
    }

    public static JButton getPrivateWord() {
        return privateWord;
    }

    public static void setPrivateWord(JButton privateWord) {
        WindowUI.privateWord = privateWord;
    }

    public static JButton getSenseWord() {
        return senseWord;
    }

    public static void setSenseWord(JButton senseWord) {
        WindowUI.senseWord = senseWord;
    }

    public static JPanel getWordPanel() {
        return wordPanel;
    }

    public static void setWordPanel(JPanel wordPanel) {
        WindowUI.wordPanel = wordPanel;
    }

    public static JPanel getPublicPanel() {
        return publicPanel;
    }

    public static void setPublicPanel(JPanel publicPanel) {
        WindowUI.publicPanel = publicPanel;
    }

    public static JPanel getPrivatePanel() {
        return privatePanel;
    }

    public static void setPrivatePanel(JPanel privatePanel) {
        WindowUI.privatePanel = privatePanel;
    }

    public static JPanel getSensePanel() {
        return sensePanel;
    }

    public static void setSensePanel(JPanel sensePanel) {
        WindowUI.sensePanel = sensePanel;
    }

    public static JButton getSaveRecord() {
        return saveRecord;
    }

    public static void setSaveRecord(JButton saveRecord) {
        WindowUI.saveRecord = saveRecord;
    }

    public static JButton getSeeRecord() {
        return seeRecord;
    }

    public static void setSeeRecord(JButton seeRecord) {
        WindowUI.seeRecord = seeRecord;
    }

    public static JFrame getChooseGroup() {
        return chooseGroup;
    }

    public static void setChooseGroup(JFrame chooseGroup) {
        WindowUI.chooseGroup = chooseGroup;
    }

    public static JButton getShowGroupList() {
        return showGroupList;
    }

    public static void setShowGroupList(JButton showGroupList) {
        WindowUI.showGroupList = showGroupList;
    }

    public static JPanel getShowGroupPanel() {
        return showGroupPanel;
    }

    public static void setShowGroupPanel(JPanel showGroupPanel) {
        WindowUI.showGroupPanel = showGroupPanel;
    }

    public static JPanel getjPanel_10() {
        return jPanel_10;
    }

    public static void setjPanel_10(JPanel jPanel_10) {
        WindowUI.jPanel_10 = jPanel_10;
    }

    public static JFrame getGroupInvite() {
        return groupInvite;
    }

    public static void setGroupInvite(JFrame groupInvite) {
        WindowUI.groupInvite = groupInvite;
    }

    public static JButton getInviteIntoGroup() {
        return inviteIntoGroup;
    }

    public static void setInviteIntoGroup(JButton inviteIntoGroup) {
        WindowUI.inviteIntoGroup = inviteIntoGroup;
    }

    public static JPanel getInvitePanel() {
        return invitePanel;
    }

    public static void setInvitePanel(JPanel invitePanel) {
        WindowUI.invitePanel = invitePanel;
    }

    public static JPanel getjPanel_11() {
        return jPanel_11;
    }

    public static void setjPanel_11(JPanel jPanel_11) {
        WindowUI.jPanel_11 = jPanel_11;
    }

    public static JList getjList1() {
        return jList1;
    }

    public static void setjList1(JList jList1) {
        WindowUI.jList1 = jList1;
    }

    public static JList getjList2() {
        return jList2;
    }

    public static void setjList2(JList jList2) {
        WindowUI.jList2 = jList2;
    }

    public static JButton getRemove() {
        return remove;
    }

    public static void setRemove(JButton remove) {
        WindowUI.remove = remove;
    }

    public static JButton getInvite() {
        return invite;
    }

    public static void setInvite(JButton invite) {
        WindowUI.invite = invite;
    }

    public static JScrollPane getInviteScrollPane1() {
        return inviteScrollPane1;
    }

    public static void setInviteScrollPane1(JScrollPane inviteScrollPane1) {
        WindowUI.inviteScrollPane1 = inviteScrollPane1;
    }

    public static JScrollPane getInviteScrollPane2() {
        return inviteScrollPane2;
    }

    public static void setInviteScrollPane2(JScrollPane inviteScrollPane2) {
        WindowUI.inviteScrollPane2 = inviteScrollPane2;
    }

    public static JFrame getGroupRemove() {
        return groupRemove;
    }

    public static void setGroupRemove(JFrame groupRemove) {
        WindowUI.groupRemove = groupRemove;
    }

    public static JButton getRemoveFromGroup() {
        return removeFromGroup;
    }

    public static void setRemoveFromGroup(JButton removeFromGroup) {
        WindowUI.removeFromGroup = removeFromGroup;
    }

    public static JPanel getRemovePanel() {
        return removePanel;
    }

    public static void setRemovePanel(JPanel removePanel) {
        WindowUI.removePanel = removePanel;
    }

    public static JScrollPane getRemoveScrollPane1() {
        return removeScrollPane1;
    }

    public static void setRemoveScrollPane1(JScrollPane removeScrollPane1) {
        WindowUI.removeScrollPane1 = removeScrollPane1;
    }

    public static JScrollPane getRemoveScrollPane2() {
        return removeScrollPane2;
    }

    public static void setRemoveScrollPane2(JScrollPane removeScrollPane2) {
        WindowUI.removeScrollPane2 = removeScrollPane2;
    }

    public static JPanel getjPanel_12() {
        return jPanel_12;
    }

    public static void setjPanel_12(JPanel jPanel_12) {
        WindowUI.jPanel_12 = jPanel_12;
    }

    public static JList getjList3() {
        return jList3;
    }

    public static void setjList3(JList jList3) {
        WindowUI.jList3 = jList3;
    }

    public static JList getjList4() {
        return jList4;
    }

    public static void setjList4(JList jList4) {
        WindowUI.jList4 = jList4;
    }

    public static JFrame getSetFrame() {
        return setFrame;
    }

    public static void setSetFrame(JFrame setFrame) {
        WindowUI.setFrame = setFrame;
    }

    public static JTabbedPane getSetPanel() {
        return setPanel;
    }

    public static void setSetPanel(JTabbedPane setPanel) {
        WindowUI.setPanel = setPanel;
    }

    public static JPanel getSetGroupNamePanel() {
        return setGroupNamePanel;
    }

    public static void setSetGroupNamePanel(JPanel setGroupNamePanel) {
        WindowUI.setGroupNamePanel = setGroupNamePanel;
    }

    public static JPanel getSetTuLingAPIPanel() {
        return setTuLingAPIPanel;
    }

    public static void setSetTuLingAPIPanel(JPanel setTuLingAPIPanel) {
        WindowUI.setTuLingAPIPanel = setTuLingAPIPanel;
    }

    public static JScrollPane getSetGroupNameJScrollPane() {
        return setGroupNameJScrollPane;
    }

    public static void setSetGroupNameJScrollPane(JScrollPane setGroupNameJScrollPane) {
        WindowUI.setGroupNameJScrollPane = setGroupNameJScrollPane;
    }

    public static JFrame getLoginFrame() {
        return loginFrame;
    }

    public static void setLoginFrame(JFrame loginFrame) {
        WindowUI.loginFrame = loginFrame;
    }

    public static JPanel getLoginPanel() {
        return loginPanel;
    }

    public static void setLoginPanel(JPanel loginPanel) {
        WindowUI.loginPanel = loginPanel;
    }

    public static JPanel getEmptyPanel() {
        return emptyPanel;
    }

    public static void setEmptyPanel(JPanel emptyPanel) {
        WindowUI.emptyPanel = emptyPanel;
    }

    public static JLabel getTuLing() {
        return tuLing;
    }

    public static void setTuLing(JLabel tuLing) {
        WindowUI.tuLing = tuLing;
    }

    public static JLabel getRobotUserName() {
        return robotUserName;
    }

    public static void setRobotUserName(JLabel robotUserName) {
        WindowUI.robotUserName = robotUserName;
    }

    public static JLabel getRobotUserPasswd() {
        return robotUserPasswd;
    }

    public static void setRobotUserPasswd(JLabel robotUserPasswd) {
        WindowUI.robotUserPasswd = robotUserPasswd;
    }

    public static JTextArea getTulingKeyArea() {
        return tulingKeyArea;
    }

    public static void setTulingKeyArea(JTextArea tulingKeyArea) {
        WindowUI.tulingKeyArea = tulingKeyArea;
    }

    public static JTextField getUserNameArea() {
        return userNameArea;
    }

    public static void setUserNameArea(JTextField userNameArea) {
        WindowUI.userNameArea = userNameArea;
    }

    public static JPasswordField getUserPasswdArea() {
        return userPasswdArea;
    }

    public static void setUserPasswdArea(JPasswordField userPasswdArea) {
        WindowUI.userPasswdArea = userPasswdArea;
    }

    public static JButton getLogin() {
        return login;
    }

    public static void setLogin(JButton login) {
        WindowUI.login = login;
    }

    public static JTextArea getSearchInviteUser() {
        return searchInviteUser;
    }

    public static void setSearchInviteUser(JTextArea searchInviteUser) {
        WindowUI.searchInviteUser = searchInviteUser;
    }

    public static JTextArea getSearchInviteGroup() {
        return searchInviteGroup;
    }

    public static void setSearchInviteGroup(JTextArea searchInviteGroup) {
        WindowUI.searchInviteGroup = searchInviteGroup;
    }

    public static JButton getLog() {
        return log;
    }

    public static void setLog(JButton log) {
        WindowUI.log = log;
    }

    public static JButton getRegister() {
        return register;
    }

    public static void setRegister(JButton register) {
        WindowUI.register = register;
    }

    public static JTextField getTimeArea() {
        return timeArea;
    }

    public static void setTimeArea(JTextField timeArea) {
        WindowUI.timeArea = timeArea;
    }

    public static JTextArea getPropertyTimeArea() {
        return propertyTimeArea;
    }

    public static void setPropertyTimeArea(JTextArea propertyTimeArea) {
        WindowUI.propertyTimeArea = propertyTimeArea;
    }

    public static JButton getSynchronization() {
        return synchronization;
    }

    public static void setSynchronization(JButton synchronization) {
        WindowUI.synchronization = synchronization;
    }

    public static JTextArea getSearchRemoveUser() {
        return searchRemoveUser;
    }

    public static void setSearchRemoveUser(JTextArea searchRemoveUser) {
        WindowUI.searchRemoveUser = searchRemoveUser;
    }

    public static JTextArea getSearchRemoveGroup() {
        return searchRemoveGroup;
    }

    public static void setSearchRemoveGroup(JTextArea searchRemoveGroup) {
        WindowUI.searchRemoveGroup = searchRemoveGroup;
    }

    public static JPanel getTipPeriodPanel() {
        return tipPeriodPanel;
    }

    public static void setTipPeriodPanel(JPanel tipPeriodPanel) {
        WindowUI.tipPeriodPanel = tipPeriodPanel;
    }

    public static JPanel getAddPeriodTipPanel() {
        return addPeriodTipPanel;
    }

    public static void setAddPeriodTipPanel(JPanel addPeriodTipPanel) {
        WindowUI.addPeriodTipPanel = addPeriodTipPanel;
    }

    public static JPanel getPropertyTimePanel() {
        return propertyTimePanel;
    }

    public static void setPropertyTimePanel(JPanel propertyTimePanel) {
        WindowUI.propertyTimePanel = propertyTimePanel;
    }

    public static JPanel getPropertyPeriodPanel() {
        return propertyPeriodPanel;
    }

    public static void setPropertyPeriodPanel(JPanel propertyPeriodPanel) {
        WindowUI.propertyPeriodPanel = propertyPeriodPanel;
    }

    public static JTabbedPane getSetTipPanel() {
        return setTipPanel;
    }

    public static void setSetTipPanel(JTabbedPane setTipPanel) {
        WindowUI.setTipPanel = setTipPanel;
    }

    public static JPanel getEmptyTipPanel() {
        return emptyTipPanel;
    }

    public static void setEmptyTipPanel(JPanel emptyTipPanel) {
        WindowUI.emptyTipPanel = emptyTipPanel;
    }

    public static JPanel getSetTimePanel() {
        return setTimePanel;
    }

    public static void setSetTimePanel(JPanel setTimePanel) {
        WindowUI.setTimePanel = setTimePanel;
    }

    public static JPanel getSetPeriodPanel() {
        return setPeriodPanel;
    }

    public static void setSetPeriodPanel(JPanel setPeriodPanel) {
        WindowUI.setPeriodPanel = setPeriodPanel;
    }

    public static JScrollPane getTipPeriodJScrollPane() {
        return tipPeriodJScrollPane;
    }

    public static void setTipPeriodJScrollPane(JScrollPane tipPeriodJScrollPane) {
        WindowUI.tipPeriodJScrollPane = tipPeriodJScrollPane;
    }

    public static JTextField getPeriodStartTime() {
        return periodStartTime;
    }

    public static void setPeriodStartTime(JTextField periodStartTime) {
        WindowUI.periodStartTime = periodStartTime;
    }

    public static JTextField getPeriodTime() {
        return periodTime;
    }

    public static void setPeriodTime(JTextField periodTime) {
        WindowUI.periodTime = periodTime;
    }

    public static JTextArea getPropertyPeriodArea() {
        return propertyPeriodArea;
    }

    public static void setPropertyPeriodArea(JTextArea propertyPeriodArea) {
        WindowUI.propertyPeriodArea = propertyPeriodArea;
    }

    public static JComboBox getGroupNamePeriodArea() {
        return groupNamePeriodArea;
    }

    public static void setGroupNamePeriodArea(JComboBox groupNamePeriodArea) {
        WindowUI.groupNamePeriodArea = groupNamePeriodArea;
    }

    public static JButton getAddTipPeriodButton() {
        return addTipPeriodButton;
    }

    public static void setAddTipPeriodButton(JButton addTipPeriodButton) {
        WindowUI.addTipPeriodButton = addTipPeriodButton;
    }

    public static JButton getModifyTulingKey() {
        return modifyTulingKey;
    }

    public static void setModifyTulingKey(JButton modifyTulingKey) {
        WindowUI.modifyTulingKey = modifyTulingKey;
    }
}
