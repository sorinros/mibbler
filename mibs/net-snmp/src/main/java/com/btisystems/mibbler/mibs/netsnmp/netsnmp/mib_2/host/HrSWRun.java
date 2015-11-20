
package com.btisystems.mibbler.mibs.netsnmp.netsnmp.mib_2.host;

import java.io.Serializable;
import com.btisystems.mibbler.mibs.netsnmp.interfaces.mib_2.host.IHrSWRun;
import com.btisystems.pronx.ems.core.model.AbstractRootEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntity;
import com.btisystems.pronx.ems.core.model.DeviceEntityDescription;
import com.btisystems.pronx.ems.core.model.IVariableBindingSetter;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.VariableBinding;

public class HrSWRun
    extends DeviceEntity
    implements Serializable, IHrSWRun, IVariableBindingSetter
{

    private int hrSWOSIndex;
    private AbstractRootEntity parentEntity;
    private final static DeviceEntityDescription _entityDescription = createEntityDescription();

    public HrSWRun() {
    }

    public int getHrSWOSIndex() {
        return this.hrSWOSIndex;
    }

    public void setHrSWOSIndex(int hrSWOSIndex) {
        int oldValue = getHrSWOSIndex();
        this.hrSWOSIndex = hrSWOSIndex;
        notifyChange(1, oldValue, hrSWOSIndex);
    }

    public void set(VariableBinding binding) {
        switch (binding.getOid().get(8)) {
            case  1 :
                setHrSWOSIndex(binding.getVariable().toInt());
                break;
        }
    }

    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("hrSWOSIndex", hrSWOSIndex).toString();
    }

    public int hashCode() {
        return new HashCodeBuilder().append(hrSWOSIndex).toHashCode();
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
        HrSWRun rhs = ((HrSWRun) obj);
        return new EqualsBuilder().append(hrSWOSIndex, rhs.hrSWOSIndex).isEquals();
    }

    public HrSWRun clone() {
        HrSWRun _copy = new HrSWRun();
        _copy.hrSWOSIndex = hrSWOSIndex;
        return _copy;
    }

    public void set_ParentEntity(AbstractRootEntity parent) {
        parentEntity = parent;
    }

    private static DeviceEntityDescription createEntityDescription() {
        DeviceEntityDescription description = new DeviceEntityDescription(new OID("1.3.6.1.2.1.25.4"));
        description.addField(new DeviceEntityDescription.FieldDescription(1, "hrSWOSIndex", DeviceEntityDescription.FieldType.INTEGER, -1));
        return description;
    }

    public DeviceEntityDescription get_Description() {
        return _entityDescription;
    }

}
