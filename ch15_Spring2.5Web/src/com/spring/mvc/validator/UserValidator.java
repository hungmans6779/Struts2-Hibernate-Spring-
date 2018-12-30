package com.spring.mvc.validator;

import org.springframework.validation.Errors;

import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.mvc.model.User;

/*
 *  驗證器
 *  
 *  驗證表單資料 User 物件值的合法性
 */
public class UserValidator implements Validator {

  
  /* 
   * 判斷驗證器是否支援指定的目標物件，每一個驗證器負責對一個表單類別的物件進行檢驗。
   * 
   * 如果錯誤地將 UserValidator 用於其他物件驗證，Spring MVC 就會根據 supports() 方法傳回操作。
   * 
   * (non-Javadoc)
   * @see org.springframework.validation.Validator#supports(java.lang.Class)
   */
  public boolean supports(Class clazz) {  
    return clazz.equals(User.class);  // 該驗證器支援的目標類別
  } // end supports
  

  
  
  
  /*
   * 對 target 物件進行合法性驗證，透過 Errors 傳回驗證錯誤的結果。
   *  
   * (non-Javadoc)
   * @see org.springframework.validation.Validator#validate(java.lang.Object, org.springframework.validation.Errors)
   */
  public void validate(Object target,Errors errors) {
    
    User user = (User)target;
    
    // 透過 Spring 的驗證工具類別進行簡易的規則驗證
    /*
     * 錯誤物件(errors)：
     * 
     * 對應欄位(username)：表示該錯誤是對應單物件的哪一個欄位，Spring MVC 的錯誤標籤就可以透過 path 屬性存取該欄位的錯誤訊息。
     * 
     * 錯誤程式碼(required.username)：表示該錯誤對應資源檔中的鍵名，Spring MVC 的錯誤標籤可以據北獲得資源檔中的對應訊息。
     *                                如果希望實現錯誤訊息的國際化，就必須透過錯誤程式碼指定錯誤訊息。 
     * 
     * 預設訊息(使用者名稱必須填寫！)：當資源檔沒有對應的錯誤程式碼時，使用預設訊息作為錯誤訊息。
     * 
     */
    ValidationUtils.rejectIfEmptyOrWhitespace(errors,"username","required.username","使用者名稱必須填寫！");
    ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password","required.password","密碼必須填寫！");

  } // end validate

  
  
}
