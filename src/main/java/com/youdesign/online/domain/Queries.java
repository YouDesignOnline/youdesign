/**
 * 
 */
package com.youdesign.online.domain;

/**
 * @author Shoaib.Zahir
 *
 */
public interface Queries {
	
	String REGISTER_USER_QUERY = "insert into user (name, email, password, mobilenumber, dob, facebookid, twitterid, instagramid, isauthorizedtopostonsocialmedia,"+
								" lastpaymentmode) values(?,?,?,?,?,?,?,?,?,?)";
	String PLACE_ORDER_QUERY = "insert into orders (userid, itemcode, quantity, price, standardsize, standardsubsize, chest, bust, hip, "+
								"shoulder, underbust, underarm, highpointshouldertobustpoint, highpointshouldertowaist, highpointshouldertoknee, "+
								"customerheight, neck, sleeve, length, pocket, expecteddeliverydate, status, paymentmode, specialrequest)"+
								" values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	String ADD_ITEM_QUERY="insert into iteminventory (itemcode, name, description, type, imageurl1, imageurl2, imageurl3, imageurl4, quantity, color, "+
						  "supplier, supplierlocation, supplieraddress, supplierrating, issleevecustomizable, isneckcustomizable, isbackcustomizable, islengthcustomizable,"+
						  "ispocketcustomizable, rating) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	String ADD_USER_ADDRESS = "insert into useraddress (userid, address, islastdeliveryaddress) values(?,?,?)";
	String ADD_ITEM_REVIEWS = "insert into itemreviews (userid, itemcode, review) values(?,?,?)";
	String INSTRUCTION_TO_TAILOR_QUERY="";
	String GENERATE_INVOICE_QUERY="";
	String ORDER_STATUS_QUERY="";
	String GET_USER_QUERY="";
	

}
