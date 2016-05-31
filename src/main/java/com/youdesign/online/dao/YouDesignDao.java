package com.youdesign.online.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import com.youdesign.online.domain.Flag;
import com.youdesign.online.domain.ItemInventory;
import com.youdesign.online.domain.Order;
import com.youdesign.online.domain.Queries;
import com.youdesign.online.domain.User;

@Component
public class YouDesignDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// @Transactional(propagation=Propagation.REQUIRED, readOnly=false,
	// rollbackFor=Exception.class)
	public boolean registerUser(User user) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(Queries.REGISTER_USER_QUERY,
						Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, user.getName());
				ps.setString(2, user.getEmail());
				ps.setString(3, user.getPassword());
				ps.setLong(4, user.getMobileNumber());
				ps.setDate(5, user.getDateOfBirth());
				ps.setString(6, user.getFacebookId());
				ps.setString(7, user.getTwitterId());
				ps.setString(8, user.getInstagramId());
				if (user.getIsAuthorizedForSocialMediaPosting() != null)
					ps.setString(9, user.getIsAuthorizedForSocialMediaPosting().name());
				else
					ps.setString(9, null);
				ps.setString(10, user.getLastPaymentMode());
				return ps;
			}
		}, keyHolder);
		long userID = keyHolder.getKey().longValue();
		user.setUserid(userID);
		return userID > 0;
	}

	public void addAddress(long userId, String address, Flag isLastDeliveryAddress) throws Exception {
		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(Queries.ADD_USER_ADDRESS);
				ps.setLong(1, userId);
				ps.setString(2, address);
				ps.setString(3, isLastDeliveryAddress.name());

				return ps;
			}
		});

	}

	public void getOrderStatus() throws Exception {

	}

	public void validateUser() throws Exception {

	}

	public void generateInvoice() throws Exception {

	}

	public void generateInstructionsToTailor() throws Exception {

	}

	public void addItemToInventory(ItemInventory item) throws Exception {

		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(Queries.ADD_ITEM_QUERY);
				ps.setInt(1, item.getItemCode());
				ps.setString(2, item.getName());
				ps.setString(3, item.getDescription());
				ps.setString(4, item.getType());
				ps.setString(5, item.getImageURL1());
				ps.setString(6, item.getImageURL2());
				ps.setString(7, item.getImageURL3());
				ps.setString(8, item.getImageURL4());
				ps.setInt(9, item.getAvailableQuantity());
				ps.setString(10, item.getColor());
				ps.setString(11, item.getSupplier());
				ps.setString(12, item.getSupplierLocation());
				ps.setString(13, item.getSupplierAddress());
				ps.setInt(14, item.getSupplierRating());
				ps.setString(15, item.getIsSleeveCustomizable().name());
				ps.setString(16, item.getIsNeckCustomizable().name());
				ps.setString(17, item.getIsBackCustomizable().name());
				ps.setString(18, item.getIsLengthCustomizable().name());
				ps.setString(19, item.getIsPocketCustomizable().name());
				ps.setInt(20, item.getItemRatings());

				return ps;
			}
		});

	}

	public void updateOrderStatus() throws Exception {

	}

	public boolean placeOrder(Order order) throws Exception {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(Queries.PLACE_ORDER_QUERY,
						Statement.RETURN_GENERATED_KEYS);
				ps.setLong(1, order.getUserId());
				ps.setLong(2, order.getItemCode());
				ps.setInt(3, order.getQuantity());
				ps.setDouble(4, order.getPrice());
				ps.setString(5, order.getSize());
				ps.setInt(6, order.getSubSize());
				ps.setInt(7, order.getCustomSize().getChest());
				ps.setInt(8, order.getCustomSize().getBust());
				ps.setInt(9, order.getCustomSize().getHip());
				ps.setInt(10, order.getCustomSize().getShoulder());
				ps.setInt(11, order.getCustomSize().getUnderBust());
				ps.setInt(12, order.getCustomSize().getUnderArm());
				ps.setInt(13, order.getCustomSize().getHighPointShoulderToBustPoint());
				ps.setInt(14, order.getCustomSize().getHighPointShoulderToWaist());
				ps.setInt(15, order.getCustomSize().getHighPointShoulderToKnee());
				ps.setInt(16, order.getCustomSize().getCustomerHeight());
				ps.setString(17, order.getNeck());
				ps.setString(18, order.getSleeve());
				ps.setString(19, order.getLength());
				ps.setString(20, order.getPocket().name());
				ps.setDate(21, order.getExpectedDeliveryDate());
				ps.setString(22, order.getOrderStatus());
				ps.setString(23, order.getPaymentMode());
				ps.setString(24, order.getSpecialRequest());

				return ps;
			}
		}, keyHolder);
		long orderId = keyHolder.getKey().longValue();
		if (orderId > 0) {
			order.setUserId(orderId);
			return true;
		} else
			return false;
	}

}
