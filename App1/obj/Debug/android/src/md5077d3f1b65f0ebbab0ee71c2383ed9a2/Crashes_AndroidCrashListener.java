package md5077d3f1b65f0ebbab0ee71c2383ed9a2;


public class Crashes_AndroidCrashListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.microsoft.appcenter.crashes.CrashesListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getErrorAttachments:(Lcom/microsoft/appcenter/crashes/model/ErrorReport;)Ljava/lang/Iterable;:GetGetErrorAttachments_Lcom_microsoft_appcenter_crashes_model_ErrorReport_Handler:Com.Microsoft.Appcenter.Crashes.ICrashesListenerInvoker, Microsoft.AppCenter.Crashes.Android.Bindings\n" +
			"n_onBeforeSending:(Lcom/microsoft/appcenter/crashes/model/ErrorReport;)V:GetOnBeforeSending_Lcom_microsoft_appcenter_crashes_model_ErrorReport_Handler:Com.Microsoft.Appcenter.Crashes.ICrashesListenerInvoker, Microsoft.AppCenter.Crashes.Android.Bindings\n" +
			"n_onSendingFailed:(Lcom/microsoft/appcenter/crashes/model/ErrorReport;Ljava/lang/Exception;)V:GetOnSendingFailed_Lcom_microsoft_appcenter_crashes_model_ErrorReport_Ljava_lang_Exception_Handler:Com.Microsoft.Appcenter.Crashes.ICrashesListenerInvoker, Microsoft.AppCenter.Crashes.Android.Bindings\n" +
			"n_onSendingSucceeded:(Lcom/microsoft/appcenter/crashes/model/ErrorReport;)V:GetOnSendingSucceeded_Lcom_microsoft_appcenter_crashes_model_ErrorReport_Handler:Com.Microsoft.Appcenter.Crashes.ICrashesListenerInvoker, Microsoft.AppCenter.Crashes.Android.Bindings\n" +
			"n_shouldAwaitUserConfirmation:()Z:GetShouldAwaitUserConfirmationHandler:Com.Microsoft.Appcenter.Crashes.ICrashesListenerInvoker, Microsoft.AppCenter.Crashes.Android.Bindings\n" +
			"n_shouldProcess:(Lcom/microsoft/appcenter/crashes/model/ErrorReport;)Z:GetShouldProcess_Lcom_microsoft_appcenter_crashes_model_ErrorReport_Handler:Com.Microsoft.Appcenter.Crashes.ICrashesListenerInvoker, Microsoft.AppCenter.Crashes.Android.Bindings\n" +
			"";
		mono.android.Runtime.register ("Microsoft.AppCenter.Crashes.Crashes+AndroidCrashListener, Microsoft.AppCenter.Crashes, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", Crashes_AndroidCrashListener.class, __md_methods);
	}


	public Crashes_AndroidCrashListener () throws java.lang.Throwable
	{
		super ();
		if (getClass () == Crashes_AndroidCrashListener.class)
			mono.android.TypeManager.Activate ("Microsoft.AppCenter.Crashes.Crashes+AndroidCrashListener, Microsoft.AppCenter.Crashes, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public java.lang.Iterable getErrorAttachments (com.microsoft.appcenter.crashes.model.ErrorReport p0)
	{
		return n_getErrorAttachments (p0);
	}

	private native java.lang.Iterable n_getErrorAttachments (com.microsoft.appcenter.crashes.model.ErrorReport p0);


	public void onBeforeSending (com.microsoft.appcenter.crashes.model.ErrorReport p0)
	{
		n_onBeforeSending (p0);
	}

	private native void n_onBeforeSending (com.microsoft.appcenter.crashes.model.ErrorReport p0);


	public void onSendingFailed (com.microsoft.appcenter.crashes.model.ErrorReport p0, java.lang.Exception p1)
	{
		n_onSendingFailed (p0, p1);
	}

	private native void n_onSendingFailed (com.microsoft.appcenter.crashes.model.ErrorReport p0, java.lang.Exception p1);


	public void onSendingSucceeded (com.microsoft.appcenter.crashes.model.ErrorReport p0)
	{
		n_onSendingSucceeded (p0);
	}

	private native void n_onSendingSucceeded (com.microsoft.appcenter.crashes.model.ErrorReport p0);


	public boolean shouldAwaitUserConfirmation ()
	{
		return n_shouldAwaitUserConfirmation ();
	}

	private native boolean n_shouldAwaitUserConfirmation ();


	public boolean shouldProcess (com.microsoft.appcenter.crashes.model.ErrorReport p0)
	{
		return n_shouldProcess (p0);
	}

	private native boolean n_shouldProcess (com.microsoft.appcenter.crashes.model.ErrorReport p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
