package com.fouriApps.model.VO;

import com.fouriApps.model.EO.XxfndReportParamsEoImpl;

import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 24 16:59:51 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxfndReportParamsVoRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ParamId {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getParamId();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setParamId((Number)value);
            }
        }
        ,
        FuncId {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getFuncId();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setFuncId((Number)value);
            }
        }
        ,
        SeqNumber {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getSeqNumber();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setSeqNumber((Number)value);
            }
        }
        ,
        ParamName {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getParamName();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setParamName((String)value);
            }
        }
        ,
        ParamTable {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getParamTable();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setParamTable((String)value);
            }
        }
        ,
        ParamColumn {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getParamColumn();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setParamColumn((String)value);
            }
        }
        ,
        ParamDispColumn {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getParamDispColumn();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setParamDispColumn((String)value);
            }
        }
        ,
        ParamLookupType {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getParamLookupType();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setParamLookupType((String)value);
            }
        }
        ,
        ActiveYn {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getActiveYn();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setActiveYn((String)value);
            }
        }
        ,
        DataType {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getDataType();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setDataType((String)value);
            }
        }
        ,
        Token {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getToken();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setToken((String)value);
            }
        }
        ,
        Mandatory {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getMandatory();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setMandatory((String)value);
            }
        }
        ,
        LovBasedUserBindVariable {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getLovBasedUserBindVariable();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setLovBasedUserBindVariable((String)value);
            }
        }
        ,
        LovBasedUserYn {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getLovBasedUserYn();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setLovBasedUserYn((String)value);
            }
        }
        ,
        LovLookupType {
            public Object get(XxfndReportParamsVoRowImpl obj) {
                return obj.getLovLookupType();
            }

            public void put(XxfndReportParamsVoRowImpl obj, Object value) {
                obj.setLovLookupType((String)value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(XxfndReportParamsVoRowImpl object);

        public abstract void put(XxfndReportParamsVoRowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int PARAMID = AttributesEnum.ParamId.index();
    public static final int FUNCID = AttributesEnum.FuncId.index();
    public static final int SEQNUMBER = AttributesEnum.SeqNumber.index();
    public static final int PARAMNAME = AttributesEnum.ParamName.index();
    public static final int PARAMTABLE = AttributesEnum.ParamTable.index();
    public static final int PARAMCOLUMN = AttributesEnum.ParamColumn.index();
    public static final int PARAMDISPCOLUMN = AttributesEnum.ParamDispColumn.index();
    public static final int PARAMLOOKUPTYPE = AttributesEnum.ParamLookupType.index();
    public static final int ACTIVEYN = AttributesEnum.ActiveYn.index();
    public static final int DATATYPE = AttributesEnum.DataType.index();
    public static final int TOKEN = AttributesEnum.Token.index();
    public static final int MANDATORY = AttributesEnum.Mandatory.index();
    public static final int LOVBASEDUSERBINDVARIABLE = AttributesEnum.LovBasedUserBindVariable.index();
    public static final int LOVBASEDUSERYN = AttributesEnum.LovBasedUserYn.index();
    public static final int LOVLOOKUPTYPE = AttributesEnum.LovLookupType.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxfndReportParamsVoRowImpl() {
    }

    /**
     * Gets XxfndReportParamsEo entity object.
     * @return the XxfndReportParamsEo
     */
    public XxfndReportParamsEoImpl getXxfndReportParamsEo() {
        return (XxfndReportParamsEoImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for PARAM_ID using the alias name ParamId.
     * @return the PARAM_ID
     */
    public Number getParamId() {
        return (Number)getAttributeInternal(PARAMID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_ID using the alias name ParamId.
     * @param value value to set the PARAM_ID
     */
    public void setParamId(Number value) {
        setAttributeInternal(PARAMID, value);
    }

    /**
     * Gets the attribute value for FUNC_ID using the alias name FuncId.
     * @return the FUNC_ID
     */
    public Number getFuncId() {
        return (Number) getAttributeInternal(FUNCID);
    }

    /**
     * Sets <code>value</code> as attribute value for FUNC_ID using the alias name FuncId.
     * @param value value to set the FUNC_ID
     */
    public void setFuncId(Number value) {
        setAttributeInternal(FUNCID, value);
    }

    /**
     * Gets the attribute value for SEQ_NUMBER using the alias name SeqNumber.
     * @return the SEQ_NUMBER
     */
    public Number getSeqNumber() {
        return (Number) getAttributeInternal(SEQNUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for SEQ_NUMBER using the alias name SeqNumber.
     * @param value value to set the SEQ_NUMBER
     */
    public void setSeqNumber(Number value) {
        setAttributeInternal(SEQNUMBER, value);
    }

    /**
     * Gets the attribute value for PARAM_NAME using the alias name ParamName.
     * @return the PARAM_NAME
     */
    public String getParamName() {
        return (String) getAttributeInternal(PARAMNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_NAME using the alias name ParamName.
     * @param value value to set the PARAM_NAME
     */
    public void setParamName(String value) {
        setAttributeInternal(PARAMNAME, value);
    }

    /**
     * Gets the attribute value for PARAM_TABLE using the alias name ParamTable.
     * @return the PARAM_TABLE
     */
    public String getParamTable() {
        return (String) getAttributeInternal(PARAMTABLE);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_TABLE using the alias name ParamTable.
     * @param value value to set the PARAM_TABLE
     */
    public void setParamTable(String value) {
        setAttributeInternal(PARAMTABLE, value);
    }

    /**
     * Gets the attribute value for PARAM_COLUMN using the alias name ParamColumn.
     * @return the PARAM_COLUMN
     */
    public String getParamColumn() {
        return (String) getAttributeInternal(PARAMCOLUMN);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_COLUMN using the alias name ParamColumn.
     * @param value value to set the PARAM_COLUMN
     */
    public void setParamColumn(String value) {
        setAttributeInternal(PARAMCOLUMN, value);
    }

    /**
     * Gets the attribute value for PARAM_DISP_COLUMN using the alias name ParamDispColumn.
     * @return the PARAM_DISP_COLUMN
     */
    public String getParamDispColumn() {
        return (String) getAttributeInternal(PARAMDISPCOLUMN);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_DISP_COLUMN using the alias name ParamDispColumn.
     * @param value value to set the PARAM_DISP_COLUMN
     */
    public void setParamDispColumn(String value) {
        setAttributeInternal(PARAMDISPCOLUMN, value);
    }

    /**
     * Gets the attribute value for PARAM_LOOKUP_TYPE using the alias name ParamLookupType.
     * @return the PARAM_LOOKUP_TYPE
     */
    public String getParamLookupType() {
        return (String) getAttributeInternal(PARAMLOOKUPTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAM_LOOKUP_TYPE using the alias name ParamLookupType.
     * @param value value to set the PARAM_LOOKUP_TYPE
     */
    public void setParamLookupType(String value) {
        setAttributeInternal(PARAMLOOKUPTYPE, value);
    }

    /**
     * Gets the attribute value for ACTIVE_YN using the alias name ActiveYn.
     * @return the ACTIVE_YN
     */
    public String getActiveYn() {
        return (String) getAttributeInternal(ACTIVEYN);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVE_YN using the alias name ActiveYn.
     * @param value value to set the ACTIVE_YN
     */
    public void setActiveYn(String value) {
        setAttributeInternal(ACTIVEYN, value);
    }


    /**
     * Gets the attribute value for DATA_TYPE using the alias name DataType.
     * @return the DATA_TYPE
     */
    public String getDataType() {
        return (String) getAttributeInternal(DATATYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for DATA_TYPE using the alias name DataType.
     * @param value value to set the DATA_TYPE
     */
    public void setDataType(String value) {
        setAttributeInternal(DATATYPE, value);
    }

    /**
     * Gets the attribute value for TOKEN using the alias name Token.
     * @return the TOKEN
     */
    public String getToken() {
        return (String) getAttributeInternal(TOKEN);
    }

    /**
     * Sets <code>value</code> as attribute value for TOKEN using the alias name Token.
     * @param value value to set the TOKEN
     */
    public void setToken(String value) {
        setAttributeInternal(TOKEN, value);
    }


    /**
     * Gets the attribute value for MANDATORY using the alias name Mandatory.
     * @return the MANDATORY
     */
    public String getMandatory() {
        return (String) getAttributeInternal(MANDATORY);
    }

    /**
     * Sets <code>value</code> as attribute value for MANDATORY using the alias name Mandatory.
     * @param value value to set the MANDATORY
     */
    public void setMandatory(String value) {
        setAttributeInternal(MANDATORY, value);
    }

    /**
     * Gets the attribute value for LOV_BASED_USER_BIND_VARIABLE using the alias name LovBasedUserBindVariable.
     * @return the LOV_BASED_USER_BIND_VARIABLE
     */
    public String getLovBasedUserBindVariable() {
        return (String) getAttributeInternal(LOVBASEDUSERBINDVARIABLE);
    }

    /**
     * Sets <code>value</code> as attribute value for LOV_BASED_USER_BIND_VARIABLE using the alias name LovBasedUserBindVariable.
     * @param value value to set the LOV_BASED_USER_BIND_VARIABLE
     */
    public void setLovBasedUserBindVariable(String value) {
        setAttributeInternal(LOVBASEDUSERBINDVARIABLE, value);
    }

    /**
     * Gets the attribute value for LOV_BASED_USER_YN using the alias name LovBasedUserYn.
     * @return the LOV_BASED_USER_YN
     */
    public String getLovBasedUserYn() {
        return (String) getAttributeInternal(LOVBASEDUSERYN);
    }

    /**
     * Sets <code>value</code> as attribute value for LOV_BASED_USER_YN using the alias name LovBasedUserYn.
     * @param value value to set the LOV_BASED_USER_YN
     */
    public void setLovBasedUserYn(String value) {
        setAttributeInternal(LOVBASEDUSERYN, value);
    }

    /**
     * Gets the attribute value for LOV_LOOKUP_TYPE using the alias name LovLookupType.
     * @return the LOV_LOOKUP_TYPE
     */
    public String getLovLookupType() {
        return (String) getAttributeInternal(LOVLOOKUPTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for LOV_LOOKUP_TYPE using the alias name LovLookupType.
     * @param value value to set the LOV_LOOKUP_TYPE
     */
    public void setLovLookupType(String value) {
        setAttributeInternal(LOVLOOKUPTYPE, value);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index,Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
