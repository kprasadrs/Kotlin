import android.content.Context
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.util.Log
import com.google.android.gms.maps.model.LatLng
import java.io.IOException

/**
 * Created by Krishnaprasad.RS on 19-06-2018.
 */
class Utility {

    companion object {
        public fun getGeoAddress(latLng: LatLng, ctxt: Context): String {
            val geocoder = Geocoder(ctxt)
            val addresses: List<Address>?
            val address: Address?
            var addressText = ""

            try {
                // 2
                addresses = geocoder.getFromLocation(latLng.latitude, latLng.longitude, 1)
                // 3
                if (null != addresses && !addresses.isEmpty()) {
                    address = addresses[0]

                    addressText=address.getAddressLine(0)+""+address.locality+""+address.countryName
                   /* for (i in 0 until address.maxAddressLineIndex) {
                        addressText += if (i == 0) address.getAddressLine(i) else "\n" + address.getAddressLine(i)
                    }*/
                }
            } catch (e: IOException) {
                Log.e("MapsActivity", e.localizedMessage)
            }

            return addressText


        }
    }
}