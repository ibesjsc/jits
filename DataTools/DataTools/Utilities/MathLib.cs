using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DataTools.Utilities
{
    class MathLib
    {
        public static double ToRadians(double val)
        {
            return (Math.PI / 180) * val;
        }
    }
}
