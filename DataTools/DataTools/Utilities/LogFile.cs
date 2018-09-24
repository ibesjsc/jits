using DataTools.Configuration;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataTools.Utilities
{
    class LogFile
    {
        public static bool WriteLog(string strFileName, string strMessage)
        {
            try
            {
                FileStream objFilestream = new FileStream(strFileName, FileMode.Append, FileAccess.Write);
                StreamWriter objStreamWriter = new StreamWriter((Stream)objFilestream);
                objStreamWriter.WriteLine(String.Format("{0} @ {1}", strMessage +" at", DateTime.Now));
                objStreamWriter.Close();
                objFilestream.Close();
                return true;
            }
            catch (Exception ex)
            {
                return false;
            }
        }

        public static bool WriteLog(string strMessage)
        {
            return WriteLog(LogConfig.pathFile, strMessage);
        }
    }
}
