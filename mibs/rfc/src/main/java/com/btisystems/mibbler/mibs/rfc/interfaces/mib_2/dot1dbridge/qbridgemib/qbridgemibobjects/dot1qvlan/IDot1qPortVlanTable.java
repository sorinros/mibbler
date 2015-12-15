
package com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan;

import java.util.Map;
import com.btisystems.mibbler.mibs.rfc.interfaces.mib_2.dot1dbridge.qbridgemib.qbridgemibobjects.dot1qvlan.dot1qportvlantable.IDot1qPortVlanEntry;
import com.btisystems.pronx.ems.core.model.IDeviceEntity;

public interface IDot1qPortVlanTable
    extends IDeviceEntity
{


    Map<String, IDot1qPortVlanEntry> getDot1qPortVlanEntry();

    IDot1qPortVlanTable clone();

}