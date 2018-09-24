using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataTools.Models
{
    class GPSFormat
    {
        public Char separator { get; set; }
        public int posDeviceID { get; set; }
        public int posType { get; set; }
        public int posDriver { get; set; }
        public int posSpeed { get; set; }
        public int posDateTime { get; set; }
        public int posXLatitude { get; set; }
        public int posYLongitute { get; set; }
        public int posZVertical { get; set; }

        public GPSFormat(char separator, int posDeviceID, int posType, int posDriver, int posSpeed, int posDateTime, int posXLatitude, int posYLongitute, int posZVertical)
        {
            this.separator = separator;
            this.posDeviceID = posDeviceID;
            this.posType = posType;
            this.posDriver = posDriver;
            this.posSpeed = posSpeed;
            this.posDateTime = posDateTime;
            this.posXLatitude = posXLatitude;
            this.posYLongitute = posYLongitute;
            this.posZVertical = posZVertical;
        }
    }
}
