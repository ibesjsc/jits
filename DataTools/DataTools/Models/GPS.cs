using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataTools.Models
{
    class GPS
    {
        public String line { get; set; }
        public String deviceID { get; set; }
        public String type { get; set; }
        public String driver { get; set; }
        public String speed { get; set; }
        public String dateTime { get; set; }
        public String xLatitude { get; set; }
        public String yLongitute { get; set; }
        public String zVertical { get; set; }

        public GPS(string line, GPSFormat format)
        {
            this.line = line;
            String[] list = line.Split(format.separator);
            deviceID = list[format.posDeviceID];
            type = list[format.posType];
            driver = list[format.posDriver];
            speed = list[format.posSpeed];
            dateTime = list[format.posDateTime];
            xLatitude = list[format.posXLatitude];
            yLongitute = list[format.posYLongitute];
            zVertical = list[format.posZVertical];
        }
    }
}
