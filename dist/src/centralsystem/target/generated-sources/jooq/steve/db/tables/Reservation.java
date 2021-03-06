/**
 * This class is generated by jOOQ
 */
package jooq.steve.db.tables;


import de.rwth.idsg.steve.utils.DateTimeConverter;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.steve.db.Keys;
import jooq.steve.db.Stevedb;
import jooq.steve.db.tables.records.ReservationRecord;

import org.joda.time.DateTime;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Reservation extends TableImpl<ReservationRecord> {

	private static final long serialVersionUID = 1409019551;

	/**
	 * The reference instance of <code>stevedb.reservation</code>
	 */
	public static final Reservation RESERVATION = new Reservation();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<ReservationRecord> getRecordType() {
		return ReservationRecord.class;
	}

	/**
	 * The column <code>stevedb.reservation.reservation_pk</code>.
	 */
	public final TableField<ReservationRecord, Integer> RESERVATION_PK = createField("reservation_pk", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>stevedb.reservation.transaction_pk</code>.
	 */
	public final TableField<ReservationRecord, Integer> TRANSACTION_PK = createField("transaction_pk", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>stevedb.reservation.idTag</code>.
	 */
	public final TableField<ReservationRecord, String> IDTAG = createField("idTag", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

	/**
	 * The column <code>stevedb.reservation.chargeBoxId</code>.
	 */
	public final TableField<ReservationRecord, String> CHARGEBOXID = createField("chargeBoxId", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>stevedb.reservation.startDatetime</code>.
	 */
	public final TableField<ReservationRecord, DateTime> STARTDATETIME = createField("startDatetime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateTimeConverter());

	/**
	 * The column <code>stevedb.reservation.expiryDatetime</code>.
	 */
	public final TableField<ReservationRecord, DateTime> EXPIRYDATETIME = createField("expiryDatetime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateTimeConverter());

	/**
	 * The column <code>stevedb.reservation.status</code>.
	 */
	public final TableField<ReservationRecord, String> STATUS = createField("status", org.jooq.impl.SQLDataType.VARCHAR.length(15).nullable(false), this, "");

	/**
	 * Create a <code>stevedb.reservation</code> table reference
	 */
	public Reservation() {
		this("reservation", null);
	}

	/**
	 * Create an aliased <code>stevedb.reservation</code> table reference
	 */
	public Reservation(String alias) {
		this(alias, RESERVATION);
	}

	private Reservation(String alias, Table<ReservationRecord> aliased) {
		this(alias, aliased, null);
	}

	private Reservation(String alias, Table<ReservationRecord> aliased, Field<?>[] parameters) {
		super(alias, Stevedb.STEVEDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<ReservationRecord, Integer> getIdentity() {
		return Keys.IDENTITY_RESERVATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<ReservationRecord> getPrimaryKey() {
		return Keys.KEY_RESERVATION_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<ReservationRecord>> getKeys() {
		return Arrays.<UniqueKey<ReservationRecord>>asList(Keys.KEY_RESERVATION_PRIMARY, Keys.KEY_RESERVATION_RESERVATION_PK_UNIQUE, Keys.KEY_RESERVATION_TRANSACTION_PK_UNIQUE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<ReservationRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<ReservationRecord, ?>>asList(Keys.FK_TRANSACTION_PK_R, Keys.FK_IDTAG_R, Keys.FK_CHARGEBOXID_R);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Reservation as(String alias) {
		return new Reservation(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Reservation rename(String name) {
		return new Reservation(name, null);
	}
}
