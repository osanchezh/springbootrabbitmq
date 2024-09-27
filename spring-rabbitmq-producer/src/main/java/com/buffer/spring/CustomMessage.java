package com.buffer.spring;

import java.util.Date;
import java.util.Objects;

public class CustomMessage {
   private String messageId;
   private String message;
   private Date messageDate;
public String getMessageId() {
	return messageId;
}
public void setMessageId(String messageId) {
	this.messageId = messageId;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Date getMessageDate() {
	return messageDate;
}
public void setMessageDate(Date messageDate) {
	this.messageDate = messageDate;
}
@Override
public String toString() {
	return "CustomMessage [messageId=" + messageId + ", message=" + message + ", messageDate=" + messageDate + "]";
}
@Override
public int hashCode() {
	return Objects.hash(message, messageDate, messageId);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CustomMessage other = (CustomMessage) obj;
	return Objects.equals(message, other.message) && Objects.equals(messageDate, other.messageDate)
			&& Objects.equals(messageId, other.messageId);
}
public CustomMessage(String messageId, String message, Date messageDate) {
	super();
	this.messageId = messageId;
	this.message = message;
	this.messageDate = messageDate;
}

}
