using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataTools.Models
{
    class Segment
    {
        //segment_id,????,????,????,street_id,street_type,(lat_start,lng_start),(lat_end,lng_end)

        public String segment_id { get; set; }
        public String street_id { get; set; }
        public String street_type { get; set; }
        public Double lat_start { get; set; }
        public Double lng_start { get; set; }
        public Double lat_end { get; set; }
        public Double lng_end { get; set; }

        public Segment(string segment_id, string street_id, string street_type, double lat_start, double lng_start, double lat_end, double lng_end)
        {
            this.segment_id = segment_id;
            this.street_id = street_id;
            this.street_type = street_type;
            this.lat_start = lat_start;
            this.lng_start = lng_start;
            this.lat_end = lat_end;
            this.lng_end = lng_end;
        }
    }
}
