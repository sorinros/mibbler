
package com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qfdbtable;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.bti7000.bti7000_13_2_0.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.Dot1qFdbTable;
import com.btisystems.mibbler.mibs.bti7000.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qtp.dot1qfdbtable.IDot1qFdbEntry;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IIndexed;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class Dot1qFdbEntry
    extends DeviceEntity
    implements Serializable, IDot1qFdbEntry, IIndexed, IVariableBindingSetter
{

    private int dot1qFdbId;
    private int dot1qFdbDynamicCount;
    private String _index;
    private Dot1qFdbTable parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public Dot1qFdbEntry() {
    }

    public int getDot1qFdbId() {
        return this.dot1qFdbId;
    }

    public void setDot1qFdbId(int dot1qFdbId) {
        int oldValue = getDot1qFdbId();
        this.dot1qFdbId = dot1qFdbId;
        notifyChange(1, oldValue, dot1qFdbId);
    }

    public int getDot1qFdbDynamicCount() {
        return this.dot1qFdbDynamicCount;
    }

    public void setDot1qFdbDynamicCount(int dot1qFdbDynamicCount) {
        int oldValue = getDot1qFdbDynamicCount();
        this.dot1qFdbDynamicCount = dot1qFdbDynamicCount;
        notifyChange(2, oldValue, dot1qFdbDynamicCount);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(12)) {
            case  1 :
                setDot1qFdbId(binding.getVariable().toInt());
                break;
            case  2 :
                setDot1qFdbDynamicCount(binding.getVariable().toInt());
                break;
        }
    }

    public void _setIndex(OID oid) {
        byte[] _oidBytes = oid.toByteArray();
        int[] _oidInts = oid.toIntArray();
        int arrayOffset = 13;
        int _len;
        _index = new OID(_oidInts, 13, (oid.size()- 13)).toString();
        setDot1qFdbId(_oidInts[arrayOffset]);
        arrayOffset += 1;
    }

    public String _getIndex() {
        return _index;
    }

    public void _setTable(Dot1qFdbTable table) {
        this.parentEntity = table;
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("dot1qFdbId", dot1qFdbId).append("dot1qFdbDynamicCount", dot1qFdbDynamicCount).append("_index", _index).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(dot1qFdbId).append(dot1qFdbDynamicCount).append(_index).toHashCode();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass()!= this.getClass()) {
            return false;
        }
        Dot1qFdbEntry rhs = ((Dot1qFdbEntry) obj);
        return new EqualsBuilder().append(dot1qFdbId, rhs.dot1qFdbId).append(dot1qFdbDynamicCount, rhs.dot1qFdbDynamicCount).append(_index, rhs._index).isEquals();
    }

    public Dot1qFdbEntry clone() {
        Dot1qFdbEntry _copy = new Dot1qFdbEntry();
        _copy.dot1qFdbId = dot1qFdbId;
        _copy.dot1qFdbDynamicCount = dot1qFdbDynamicCount;
        _copy._index = _index;
        _copy.parentEntity = parentEntity;
        return _copy;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.17.7.1.2.1.1"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "dot1qFdbId", DeviceEntityDescription.FieldType.UNSIGNED32, -1));
        description.addField(new DeviceEntityDescription.FieldDescription(2, "dot1qFdbDynamicCount", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
