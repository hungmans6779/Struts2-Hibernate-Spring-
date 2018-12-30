package com.spring.mvc.handler.command;


/*
 * “ 级糶ンΤンよ獽ㄏノ把计
 * 
 * パ祘Α絏command 旧把计讽 Struts1.x  ActionForm ぃ琌 command 度琌 POJO ぃ惠璶龟瞷ヴ疭ざ
 * 
 * パ UserCommand Τ uid 妮┦硂ボ狦 URL 叫―いΤ暗 uid 把计ê或ウ盢砞﹚ン uid 妮┦い
 * ㄒhttp://localhost:8080/ch15_Spring2.5Web/userCommand.mvc?uid=00001
 */
public class UserCommand {

  private int uid;   // 把计嘿


  /*
   *  莉眔把计よ猭
   */
  public int getUid() {
    return uid;
  }

  
  /*
   *  砞﹚把计よ猭
   */
  public void setUid(int uid) {
    this.uid = uid;
  }


}
