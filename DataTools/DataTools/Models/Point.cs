using DataTools.Utilities;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataTools.Models
{
    class Point
    {
        public Double lat { set; get; }
        public Double lng { set; get; }

        public Point(double lat, double lng)
        {
            this.lat = lat;
            this.lng = lng;
        }

        public Point(string lat, string lng)
        {
            this.lat = Double.Parse(lat);
            this.lng = Double.Parse(lng);
        }

        public double Distance(Point point)
        {
            double lat1 = this.lat; double lng1 = this.lng; double lat2 = point.lat; double lng2 = point.lng;

            double earthRadius = Parameters.R; //6371 * 1000
            double dLat = MathLib.ToRadians(lat2 - lat1);
            double dLng = MathLib.ToRadians(lng2 - lng1);
            double sindLat = Math.Sin(dLat / 2);
            double sindLng = Math.Sin(dLng / 2);
            double a = Math.Pow(sindLat, 2)
                    + Math.Pow(sindLng, 2) * Math.Cos(MathLib.ToRadians(lat1)) * Math.Cos(MathLib.ToRadians(lat2));
            double c = 2 * Math.Atan2(Math.Sqrt(a), Math.Sqrt(1 - a));
            double dist = earthRadius * c;
            return dist;
        }
    }
}
