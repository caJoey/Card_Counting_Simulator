public class average{
    /*
    This class finds the average of different arrays, which represent samples of data that can be copy and pasted in from testing.txt
     */
    public static void main(String[]args){
        double[] big = new double[]{6820.0, 5702.5, 4745.0, 5670.0, 3715.0, 6662.5, 5402.5, 4040.5, 3977.5, 4912.5, 4632.5, 5655.0, 4102.5, 4975.0, 5445.0, 5702.5, 5077.5, 5052.5, 5140.0, 5452.5, 4707.5, 4890.0, 5407.5, 3427.5, 4347.5, 4597.5, 4600.0, 5850.0, 6617.5, 5025.0, 6695.0, 4990.0, 5785.0, 5682.5, 4425.0, 4702.5, 4065.0, 5917.5, 4095.0, 7137.5, 4047.5, 5142.5, 4612.5, 4482.5, 4267.5, 5632.5, 4950.0, 2475.0, 3287.5, 2742.5, 6407.5, 4645.0, 5058.0, 7140.0, 4127.5, 4880.0, 4122.5, 4315.0, 4957.5, 4255.0, 5725.0, 5795.0, 4925.0, 5613.0, 4740.0, 6120.0, 4470.0, 5090.0, 3997.5, 5550.0, 3915.0, 5802.5, 5225.0, 3622.5, 3363.0, 5820.5, 4587.5, 4640.0, 4560.0, 6475.0, 6385.0, 6317.5, 4557.5, 7280.0, 5207.5, 4940.0, 5500.0, 5125.0, 2875.0, 3667.5, 5320.0, 4280.0, 5645.0, 5010.0, 4870.0, 4235.0, 5032.5, 5320.0, 4640.0, 6600.0, 5872.5, 4467.5, 5387.5, 6380.0, 5320.0, 5962.5, 3885.0, 4370.0, 5857.5, 5862.5, 5837.5, 5735.0, 3282.5, 4645.5, 6502.5, 5812.5, 6953.5, 5852.5, 5002.5, 5825.0, 6640.0, 7458.0, 6182.5, 4860.0, 4557.5, 5045.0, 5505.0, 4320.0, 6870.0, 5535.0, 4797.5, 4687.5, 7187.5, 6858.0, 4008.0, 5290.0, 5737.5, 5080.0, 5122.5, 4802.5, 4110.0, 5552.5, 4700.0, 3610.0, 5842.5, 4390.0, 6257.5, 5840.0, 7542.5, 3472.5, 5165.0, 3755.0, 5562.5, 5087.5, 3885.0, 3635.0, 5835.0, 5535.0, 5230.0, 4627.5, 4242.5, 4662.5, 3257.5, 7855.0, 5465.0, 4290.0, 6962.5, 5742.5, 5160.0, 5237.5, 6077.5, 5785.0, 4372.5, 6270.0, 5755.0, 3165.0, 5987.5, 4315.0, 4632.5, 5860.0, 3475.0, 4037.5, 5940.0, 3182.5, 4055.0, 6697.5, 6492.5, 5825.0, 4127.5, 4945.0, 5282.5, 6437.5, 4345.0, 5630.0, 5385.0, 5870.0, 3860.5, 3270.0, 5447.5, 3355.0, 4645.0, 4355.0, 5185.0, 5145.0, 4020.0, 5807.5, 5280.0, 5127.5, 5992.5, 3182.5, 5772.5, 3933.0, 5617.5, 4432.5, 5050.0, 7152.5, 5972.5, 7282.5, 7265.0, 3875.0, 4292.5, 3740.0, 3385.0, 2092.5, 5390.0, 5292.5, 5482.5, 5855.0, 4615.0, 5135.0, 5237.5, 3122.5, 5777.5, 4207.5, 6695.0, 5532.5, 5417.5, 5437.5, 5015.0, 6417.5, 5240.5, 3195.0, 5302.5, 4517.5, 4830.0, 4535.0, 4992.5, 5067.5, 4820.0, 6610.0, 4317.5, 3662.5, 7185.0, 5695.0, 4852.5, 4220.0, 5330.0, 3920.0, 6990.0, 6347.5, 1252.5, 4840.0, 2465.0, 5637.5, 5197.5, 5172.5, 5100.0, 6730.0, 4217.5, 4317.5, 5755.0, 4190.0, 6380.0, 4827.5, 5542.5, 5517.5, 4365.0, 5600.0, 6227.5, 4317.5, 5695.0, 4175.0, 7185.0, 5177.5, 4462.5, 4905.0, 5767.5, 5227.5, 3980.0, 5080.0, 4760.0, 5720.0, 4645.0, 6400.0, 5935.0, 4520.0, 7700.0, 5845.0, 6075.0, 4757.5, 4145.0, 4855.0, 5000.0, 4040.0, 4875.0, 6162.5, 2887.5, 5257.5, 4675.0, 6510.0, 5687.5, 5840.0, 5197.5, 5452.5, 5350.0, 5820.0, 6225.0, 4117.5, 5335.0, 4997.5, 2790.0, 6522.5, 4912.5, 5015.0, 5927.5, 3562.5, 5890.0, 6837.5, 5180.0, 5397.5, 3575.0, 7112.5, 4632.5, 6315.0, 5542.5, 4255.0, 5260.0, 4075.0, 4035.0, 4922.5, 5810.0, 4465.0, 3655.0, 5610.0, 8160.0, 4310.0, 5852.5, 6815.0, 5730.0, 6230.0, 2687.5, 5467.5, 5995.0, 4440.0, 4322.5, 4848.0, 5042.5, 5297.5, 3500.0, 5820.0, 5285.0, 5355.0, 4775.0, 7032.5, 5130.0, 6097.5, 5822.5, 4915.0, 5097.5, 6482.5, 4347.5, 4752.5, 4537.5, 6725.0, 3655.0, 6370.0, 5593.0, 4410.0, 5372.5, 5385.0, 5340.0, 3940.0, 6480.0, 4020.0, 4587.5, 3785.0, 5287.5, 5640.0, 5322.5, 5330.0, 3762.5, 5802.5, 2650.0, 4395.0, 5620.0, 3010.0, 6220.0, 6475.0, 6537.5, 6042.5, 6002.5, 5182.5, 5020.0, 4922.5, 4665.0, 5227.5, 5317.5, 5933.0, 4087.5, 5035.0, 4050.0, 4685.0, 5110.0, 5590.0, 4170.0, 5372.5, 5297.5, 6775.0, 3985.0, 5630.0, 5225.0, 6965.0, 6062.5, 4687.5, 4445.0, 6842.5, 3432.5, 3557.5, 5587.5, 5327.5, 4120.0, 7285.0, 5147.5, 5855.0, 4067.5, 4673.0, 4402.5, 5147.5, 6115.0, 6322.5, 5880.0, 4632.5, 5332.5, 3365.0, 4357.5, 3597.5, 3777.5, 5745.0, 5227.5, 4445.0, 5472.5, 6735.0, 8247.5, 5352.5, 4605.0, 6730.0, 3487.5, 5865.0, 5153.0, 4142.5, 3152.5, 5130.0, 4345.0, 6645.0, 3725.0, 6422.5, 5857.5, 4582.5, 4142.5, 4670.0, 5645.0, 7200.0, 4807.5, 5682.5, 4747.5, 3815.0, 4852.5, 5815.0, 4097.5, 7065.0, 3047.5, 4815.0, 6662.5, 7425.0, 4802.5, 5732.5, 5307.5, 5857.5, 6132.5, 4092.5, 5932.5, 4760.0, 4172.5, 4500.0, 6375.0, 3830.0, 3165.0, 4482.5, 5660.0, 3220.0, 4142.5, 5735.0, 5145.0, 3490.0, 4290.0, 5877.5, 5007.5, 4472.5, 4955.0, 5340.0, 5447.5, 5785.0, 4250.0, 5650.0, 4072.5, 5185.0, 5850.0, 4060.0, 5172.5, 4285.0, 5525.0, 4670.5, 7727.5, 6185.0, 7605.0, 6530.0, 4517.5, 4797.5, 4585.0, 5887.5, 5690.0, 5592.5, 2520.0, 4782.5, 3582.5, 5095.0, 5645.0, 5052.5, 2810.0, 6030.0, 3642.5, 5902.5, 4110.0, 4292.5, 5955.0, 5457.5, 5702.5, 5600.0, 3910.0, 5037.5, 5340.0, 5730.0, 4885.0, 3900.0, 4027.5, 4225.0, 4825.0, 6042.5, 6290.0, 7375.0, 5272.5, 5800.0, 3967.5, 4430.0, 5077.5, 4650.5, 3150.0, 3387.5, 3940.0, 6655.0, 2947.5, 4925.0, 4450.0, 5847.5, 6112.5, 4352.5, 4807.5, 4060.0, 3832.5, 3567.5, 4347.5, 2975.0, 4132.5, 2807.5, 4910.0, 6137.5, 5355.0, 5145.0, 2543.0, 3952.5, 6527.5, 3885.0, 4240.0, 4407.5, 3817.5, 4097.5, 6157.5, 3682.5, 4635.0, 3757.5, 6430.0, 6545.0, 4630.0, 4715.0, 5745.0, 3005.0, 6582.5, 5335.0, 6725.0, 4205.0, 6267.5, 4672.5, 4912.5, 5925.0, 5175.0, 4857.5, 4675.0, 4942.5, 3967.5, 2825.0, 6627.5, 4517.5, 5142.5, 6287.5, 5087.5, 6410.0, 7415.0, 4970.0, 4747.5, 3552.5, 4727.5, 6125.0, 5187.5, 4397.5, 4777.5, 4045.0, 5892.5, 5432.5, 5390.0, 4870.0, 5645.0, 5447.5, 4470.0, 5475.0, 4640.0, 5187.5, 4272.5, 5455.0, 5385.0, 6422.5, 5407.5, 4125.0, 2517.5, 6278.0, 4905.0, 4382.5, 4395.0, 4825.0, 3632.5, 5812.5, 4082.5, 7455.0, 6697.5, 3070.0, 4938.0, 5520.0, 3715.0, 5935.0, 4225.0, 5260.0, 6752.5, 3045.0, 3605.0, 4030.0, 5980.0, 6000.0, 2865.0, 5472.5, 3012.5, 5032.5, 3395.0, 5340.0, 5922.5, 5822.5, 5000.0, 4687.5, 5845.0, 4065.0, 5682.5, 4607.5, 5390.0, 3522.5, 6085.0, 5705.5, 4310.0, 4735.0, 6057.5, 6172.5, 3460.0, 4035.5, 3430.0, 5002.5, 2795.0, 3922.5, 4242.5, 5770.0, 7790.0, 4747.5, 2960.0, 5170.0, 4465.0, 5325.0, 4457.5, 5275.0, 4390.0, 6295.0, 6150.0, 4120.0, 5425.0, 4842.5, 6420.0, 3487.5, 5922.5, 4192.5, 6162.5, 5505.0, 5690.0, 4200.0, 4105.0, 4040.0, 3780.0, 5397.5, 5352.5, 5405.0, 3282.5, 4187.5, 6872.5, 5347.5, 5950.0, 4870.0, 4965.0, 5080.0, 3402.5, 2947.5, 5380.0, 6395.0, 4792.5, 2727.5, 6355.0, 3980.0, 3875.5, 5055.0, 3427.5, 3405.0, 4635.0, 3455.0, 5730.0, 4695.0, 4912.5, 4092.5, 4000.0, 5592.5, 3827.5, 4610.0, 4795.0, 4825.0, 5377.5, 5845.0, 5547.5, 5165.0, 4510.0, 6052.5, 6087.5, 4995.0, 5665.0, 2957.5, 6272.5, 5945.0, 5312.5, 2697.5, 5685.0, 6355.0, 5707.5, 3895.0, 3872.5, 6537.5, 6082.5, 4305.0, 3067.5, 5362.5, 5427.5, 4745.0, 4775.0, 5920.5, 7247.5, 5417.5, 4475.0, 5690.0, 3645.0, 5810.0, 4770.0, 6170.0, 4235.0, 5072.5, 5270.0, 5275.0, 5545.0, 5987.5, 3290.0, 6207.5, 6927.5, 3197.5, 3425.0, 1807.5, 6577.5, 5382.5, 7100.0, 4967.5, 3297.5, 3802.5, 5992.5, 5727.5, 3855.0, 4572.5, 6815.0, 4257.5, 4285.0, 4410.0, 3740.0, 4582.5, 7802.5, 5317.5, 3320.0, 4910.0, 2835.0, 6227.5, 3462.5, 3390.0, 3822.5, 6957.5, 4670.0, 6455.0, 5252.5, 3985.0, 6580.0, 3282.5, 5775.0, 5105.0, 6738.0, 2715.0, 4075.0, 5510.0, 7095.0, 5967.5, 5375.0, 5237.5, 5682.5, 5217.5, 5207.5, 4832.5, 5552.5, 3282.5, 4562.5, 6177.5, 4015.0, 6755.0, 5172.5, 6350.0, 5890.0, 5472.5, 5675.0, 2805.0, 5360.0, 5012.5, 5517.5, 5052.5, 3352.5, 4722.5, 5290.0, 6030.0, 4470.0, 5730.0, 6470.0, 5490.0, 5473.0, 3987.5, 6227.5, 5790.0, 5727.5, 4257.5, 5105.0, 4952.5, 4200.0, 4635.0, 5585.0, 6915.0, 5483.0, 5465.0, 4920.0, 5142.5, 5130.0, 5875.0, 4450.0, 4780.0, 4755.0, 6200.0, 4125.0, 3670.0, 5427.5, 5250.0, 4965.0, 5175.0, 5252.5, 3020.0, 6407.5, 4950.0, 3480.0, 5982.5, 6005.0, 5872.5, 5205.0, 3247.5, 3315.0, 6295.5, 5832.5, 5257.5, 5847.5, 5127.5, 6330.0, 4787.5, 5345.0, 4677.5, 4652.5, 3952.5, 5815.0, 5027.5, 2852.5, 5590.0, 6282.5, 5497.5, 3577.5, 4790.0, 3757.5, 4437.5, 5545.0, 4897.5, 4660.0, 4467.5, 6020.0, 4390.0, 5127.5, 5952.5, 5360.0, 4405.0, 5727.5, 4677.5, 6670.0, 4190.0, 7847.5, 5637.5, 5545.0, 5210.0, 5580.0, 6660.0, 5150.0, 5332.5, 6067.5, 4135.0, 5457.5, 6120.0, 6150.0, 5320.0, 2495.0, 6035.0, 4012.5, 3640.0, 5760.0, 4110.0, 3335.0, 5300.0, 4847.5, 5667.5, 5267.5, 4225.0, 6390.0, 6895.0, 5677.5, 5560.0, 4922.5, 6767.5, 6745.0, 5842.5, 6590.0, 6225.0, 5467.5, 6310.0, 5937.5, 5242.5, 4547.5, 4955.0, 5790.0, 4672.5, 5450.0, 3737.5, 5722.5, 4402.5, 5172.5, 4922.5, 3782.5, 4295.0, 6740.0, 4810.0, 5430.0, 4802.5, 4088.0, 3225.0, 4656.0, 5595.0, 4207.5, 6175.0, 5097.5, 5680.0, 6095.0, 5067.5, 5565.0, 6035.0, 5105.0, 6620.0, 5142.5, 3712.5, 5827.5, 5435.0, 6032.5, 4967.5, 4817.5, 4975.0, 5827.5, 5460.0, 4992.5, 2190.0, 6262.5, 4595.0, 6115.0, 6465.0, 5850.0, 5900.0, 3947.5, 5095.0, 5317.5, 5470.0, 6295.0, 4480.0, 5867.5, 4192.5, 3395.0, 6720.0, 6072.5, 4185.0, 4605.0, 5242.5, 4900.0, 5057.5, 4375.0, 5172.5, 5730.0, 5805.0, 7990.0, 4470.0, 4442.5, 4487.5, 5615.0, 4322.5, 3800.0, 6280.0, 6140.0, 4902.5, 3820.0, 5845.0, 6647.5, 4730.0, 5207.5, 5320.0, 5957.5, 5227.5, 4965.0, 3615.0, 3800.0, 5022.5, 5167.5, 4360.0, 6242.5, 4075.0, 6030.0, 4997.5, 5845.0, 7070.0, 3647.5, 6023.0, 3947.5, 5630.0, 5782.5, 5167.5, 4390.0, 6755.0, 6085.0, 5180.0, 5440.0, 6260.0, 4722.5, 5635.0, 5187.5, 4862.5, 5785.5, 6260.0, 5842.5, 5355.0, 4207.5, 4557.5, 6347.5, 6657.5, 6597.5, 5735.0, 6660.0, 4600.0, 5580.0, 4775.0, 4407.5, 5942.5, 4205.0, 4467.5, 5690.0, 5345.0, 4812.5, 3732.5, 4945.0, 4495.0, 4853.0, 4760.0, 4285.0, 5407.5, 5832.5, 5005.0, 4290.0, 5352.5, 6807.5, 6482.5, 3822.5, 5127.5, 5707.5, 4797.5, 6220.0, 6432.5, 4760.0, 5632.5, 4897.5, 5462.5, 4090.0, 5115.0, 2800.0, 4540.0, 3870.0, 6047.5, 4803.0, 5577.5, 4612.5, 4697.5, 4940.0, 6345.0, 3690.0, 4672.5, 5645.0, 5992.5, 4780.0, 1485.0, 4815.0, 5617.5, 4357.5, 7117.5, 3840.0, 6390.0, 6587.5, 4870.0, 5437.5, 6237.5, 5205.0, 4825.0, 4517.5, 5615.0, 7097.5, 4680.0, 5447.5, 3172.5, 4955.0, 6770.0, 5502.5, 3662.5, 4715.5, 5455.0, 6032.5, 5550.0, 4672.5, 4857.5, 4962.5, 4825.0, 4655.0, 5402.5, 4620.0, 6265.0, 8240.0, 6597.5, 5102.5, 4045.0, 2927.5, 6352.5, 4915.0, 5665.0, 4225.0, 5887.5, 6000.0, 4580.0, 6117.5, 6467.5, 3705.0, 5790.0, 4437.5, 3657.5, 6570.0, 5095.0, 3545.0, 6192.5, 4937.5, 4790.5, 5810.0, 5747.5, 4780.0, 4077.5, 5265.0, 4807.5, 5315.0, 4062.5, 5227.5, 5752.5, 4410.0, 4365.0, 4057.5, 3740.0, 3875.0, 3592.5, 3260.0, 4525.0, 5410.0, 4357.5, 5222.5, 4802.5, 4403.0, 4930.0, 5445.0, 5930.0, 6507.5, 7220.0, 5200.0, 4580.0, 5815.0, 8315.0, 5815.0, 5262.5, 4252.5, 7575.0, 6377.5, 5680.0, 4553.0, 5900.0, 4535.5, 4137.5, 4135.5, 4225.0, 4930.0, 6385.0, 3917.5, 4110.0, 4002.5, 3462.5, 5430.0, 4067.5, 6317.5, 5272.5, 4497.5, 7032.5, 4092.5, 5262.5, 4110.0, 4530.0, 3452.5, 5000.0, 4112.5, 4595.0, 5602.5, 5335.0, 4277.5, 5275.0, 4255.0, 4805.0, 5845.0, 5025.5, 4172.5, 5495.0, 5112.5, 5590.0, 4357.5, 6035.0, 3832.5, 4342.5, 6142.5, 6585.0, 6097.5, 4972.5, 6090.0, 7852.5, 5300.0, 5020.0, 4325.0, 3532.5, 4852.5, 5365.0, 6527.5, 3860.0, 6097.5, 6393.0, 4810.0, 4910.0, 4357.5, 6142.5, 4257.5, 7330.0, 4857.5, 5732.5, 5025.0, 6065.0, 5470.0, 5482.5, 6667.5, 5397.5, 4937.5, 6725.0, 3387.5, 7320.0, 5787.5, 3340.0, 5965.0, 5670.0, 4435.0, 3412.5, 5317.5, 3902.5, 5292.5, 4717.5, 4275.0, 5095.0, 4852.5, 2642.5, 6450.0, 4407.5, 6042.5, 5725.0, 4830.0, 4990.0, 4075.0, 5590.0, 5422.5, 6017.5, 5105.0, 4092.5, 4997.5, 6382.5, 5757.5, 4452.5, 4865.0, 6150.0, 5082.5, 4717.5, 6335.0, 5655.0, 4767.5, 5505.0, 6412.5, 4700.0, 5577.5, 4740.0, 5510.0, 4810.0, 5270.0, 3867.5, 4015.0, 4885.0, 4367.5, 4380.0, 6430.0, 3517.5, 3252.5, 6370.0, 4650.0, 4580.0, 5017.5, 5818.0, 3715.0, 5602.5, 6435.0, 8047.5, 2410.0, 5380.0, 5592.5, 2522.5, 5462.5, 4877.5, 6005.0, 5452.5, 4572.5, 5410.0, 4047.5, 4407.5, 5450.0, 3772.5, 5272.5, 5095.0, 4607.5, 5527.5, 5355.0, 6032.5, 5027.5, 5755.0, 5452.5, 5480.0, 5262.5, 5490.0, 5292.5, 6107.5, 4385.0, 5437.5, 6480.0, 5575.0, 3242.5, 4132.5, 4970.0, 4110.0, 3995.0, 5365.0, 5822.5, 4045.0, 4197.5, 5245.0, 4390.0, 4820.0, 5760.0, 3820.0, 5247.5, 5722.5, 5282.5, 3195.0, 4847.5, 3885.0, 4555.5, 6725.0, 4637.5, 5805.0, 6880.0, 6862.5, 6192.5, 5490.0, 6080.0, 5320.0, 6072.5, 3687.5, 5180.0, 5870.0, 5372.5, 5652.5, 5027.5, 4932.5, 6537.5, 5362.5, 5677.5, 4907.5, 6120.0, 6715.0, 3412.5, 5597.5, 4047.5, 5095.5, 4580.0, 5550.0, 6105.0, 6047.5, 5795.0, 5727.5, 5190.5, 4852.5, 5780.0, 3777.5, 4562.5, 4882.5, 4785.0, 4267.5, 6015.0, 5807.5, 4760.0, 4050.0, 4762.5, 5035.0, 3862.5, 6927.5, 4540.0, 4270.0, 4877.5, 4807.5, 3540.0, 5332.5, 7150.0, 3807.5, 5117.5, 7767.5, 6502.5, 5712.5, 5650.0, 4275.0, 4310.0, 3865.0, 4112.5, 5260.0, 4385.0, 4752.5, 5185.0, 4257.5, 4950.0, 7460.0, 4740.0, 4327.5, 4527.5, 4872.5, 5870.0, 8152.5, 3892.5, 5917.5, 5267.5, 5107.5, 5905.0, 7257.5, 4947.5, 3802.5, 6270.0, 3002.5, 4865.0, 5105.0, 5967.5, 7502.5, 5882.5, 4492.5, 5887.5, 3947.5, 6027.5, 6077.5, 4505.0, 6392.5, 3797.5, 5072.5, 6747.5, 4182.5, 3852.5, 6030.0, 4982.5, 4337.5, 5718.0, 4522.5, 3882.5, 5320.0, 5042.5, 6350.0, 5295.0, 4968.0, 4847.5, 4910.0, 4520.0, 7700.0, 3600.0, 1982.5, 5105.0, 4912.5, 5892.5, 5115.0, 3892.5, 6542.5, 4310.0, 4405.0, 5907.5, 5315.0, 5787.5, 8100.0, 4460.0, 3147.5, 5507.5, 6000.0, 5297.5, 4877.5, 5542.5, 4445.0, 6457.5, 5582.5, 3980.0, 6045.0, 5962.5, 6287.5, 5465.0, 5802.5, 4443.0, 5717.5, 3337.5, 6302.5, 5550.0, 6012.5, 5635.0, 5792.5, 4900.0, 5065.0, 4385.0, 4205.0, 4775.0, 6637.5, 3470.0, 4960.0, 5405.0, 4822.5, 4257.5, 4967.5, 2857.5, 5050.0, 4732.5, 4910.0, 4920.0, 3155.0, 6232.5, 4437.5, 6640.0, 5605.0, 6037.5, 6405.0, 3355.0, 4760.0, 5500.0, 4410.0, 4140.0, 5877.5, 4827.5, 4662.5, 5390.0, 5585.0, 5375.0, 5175.0, 5762.5, 5775.0, 5432.5, 4530.0, 3947.5, 5685.0, 4305.0, 4877.5, 4845.0, 5380.0, 7120.0, 5707.5, 6167.5, 4127.5, 3965.0, 4230.0, 4785.0, 7090.0, 5465.0, 4875.0, 4270.0, 4207.5, 5390.0, 4415.5, 3747.5, 2510.0, 4400.0, 6092.5, 4600.0, 4662.5, 5437.5, 5880.0, 3150.0, 3477.5, 6655.0, 4597.5, 6808.0, 4865.0, 6387.5, 4657.5, 5187.5, 3207.5, 5212.5, 3210.0, 6245.0, 4322.5, 6125.0, 3745.5, 4460.0, 7212.5, 2915.0, 4987.5, 5512.5, 4095.0, 5712.5, 5892.5, 5717.5, 4888.0, 5240.0, 5335.0, 5212.5, 4862.5, 5337.5, 4167.5, 6787.5, 4182.5, 4207.5, 5445.0, 3215.0, 2560.0, 6910.5, 5260.0, 3907.5, 7480.0, 5482.5, 5122.5, 4012.5, 4740.0, 7435.0, 2912.5, 4340.0, 4107.5, 5885.0, 6355.0, 4832.5, 4730.0, 5547.5, 6747.5, 5802.5, 5240.0, 5560.0, 5882.5, 4990.0, 4897.5, 4382.5, 6307.5, 4920.0, 4387.5, 4937.5, 7770.0, 5390.0, 5045.0, 4612.5, 4480.0, 5887.5, 5567.5, 5177.5, 3357.5, 4995.0, 2612.5, 4275.0, 7007.5, 5060.0, 5325.0, 6140.0, 3075.5, 6035.0, 5017.5, 5700.0, 4192.5, 6185.0, 5182.5, 4725.0, 7262.5, 3652.5, 4020.0, 3875.0, 5567.5, 3122.5, 4450.0, 6570.0, 5132.5, 5597.5, 5055.0, 3895.0, 5107.5, 5092.5, 5142.5, 4262.5, 4755.0, 3520.0, 5107.5, 6645.5, 4137.5, 4647.5, 4142.5, 5082.5, 6387.5, 3955.0, 5605.0, 5793.0, 5010.0, 5610.0, 5075.0, 4405.0, 7907.5, 4812.5, 4925.0, 6515.0, 6020.0, 6072.5, 5342.5, 5248.0, 5930.0, 3680.0, 4655.0, 5990.0, 5182.5, 7342.5, 6055.0, 6427.5, 3975.0, 5742.5, 4165.0, 2965.0, 7000.0, 3142.5, 5065.0, 6175.0, 4660.0, 6562.5, 6345.0, 6272.5, 3562.5, 5557.5, 4182.5, 4557.5, 5860.0, 5747.5, 4702.5, 4187.5, 5882.5, 4255.0, 4917.5, 6927.5, 4960.0, 3560.0, 7295.0, 5412.5, 5610.0, 4672.5, 5612.5, 2997.5, 4622.5, 5215.0, 7602.5, 5072.5, 5835.0, 4630.0, 5037.5, 5262.5, 4797.5, 5265.0, 5855.0, 4337.5, 4295.0, 6950.0, 6387.5, 4437.5, 4857.5, 6220.0, 4955.0, 4410.0, 6102.5, 7497.5, 4525.0, 4720.0, 3400.0, 4790.0, 4662.5, 6155.0, 5335.0, 4767.5, 3812.5, 4765.0, 3917.5, 4502.5, 5892.5, 5445.0, 4672.5, 6362.5, 4115.0, 4737.5, 8512.5, 3770.0, 4495.5, 5682.5, 3812.5, 4625.0, 6272.5, 5830.0, 5745.0, 5615.0, 3392.5, 4637.5, 5257.5, 3967.5, 4215.0, 4812.5, 4655.0, 6352.5, 4002.5, 4687.5, 3497.5, 3775.0, 5610.0, 5827.5, 4995.0, 4917.5, 5605.0, 5012.5, 5727.5, 4642.5, 7732.5, 3557.5, 3820.0, 4697.5, 5525.0, 7435.0, 4767.5, 4812.5, 4800.0, 4715.0, 4765.0, 6297.5, 4910.0, 5187.5, 4230.0, 4830.0, 6047.5, 4512.5, 4680.0, 3747.5, 5667.5, 3860.5, 4595.0, 4602.5, 2702.5, 6645.0, 6585.5, 4990.0, 3630.0, 6052.5, 4940.0, 6102.5, 3407.5, 5485.0, 3530.0, 3852.5, 6117.5, 6113.0, 4040.0, 5287.5, 6402.5, 6535.0, 5872.5, 5222.5, 5607.5, 5210.0, 6670.0, 4670.0, 5903.0, 4160.0, 6320.0, 2230.0, 6110.0, 4685.0, 4192.5, 4645.0, 5325.0, 4405.0, 4385.0, 4102.5, };
        //5-80 bet spread, 2 main deviations, leave table at 3+, split only once (20000 hour sample) $9.2 / hour

        double[] tenToEighty = new double[]{5680.0, 6340.0, 3830.0, 5625.0, 5705.0, 7495.0, 4800.0, 4680.0, 2460.0, 7560.0, 4400.0, 6525.0, 3930.0, 6400.0, 3725.0, 7520.0, 4765.0, 4465.0, 4275.0, 5840.0, 4130.0, 5255.0, 4950.0, 6140.0, 5935.0, 4470.0, 4870.0, 3525.0, 5000.0, 5965.0, 6860.0, 6105.0, 4135.0, 7540.0, 5655.0, 4525.0, 5005.0, 5930.0, 4420.0, 5470.0, 4130.0, 5895.0, 4815.0, 5085.0, 5300.0, 4295.0, 6550.0, 4545.0, 6395.0, 4585.0, 5270.0, 6445.0, 4860.0, 4065.0, 5395.0, 6835.0, 4720.0, 5045.0, 6185.0, 3845.0, 5880.0, 4465.0, 5825.0, 4665.0, 6380.0, 5455.0, 5925.0, 5395.0, 7360.0, 4590.0, 6045.0, 4645.0, 6120.0, 4030.0, 6455.0, 5380.0, 4415.0, 4700.0, 6090.0, 5000.0, 2790.0, 4945.0, 5200.0, 2940.0, 3915.0, 4170.0, 5090.0, 5015.0, 4925.0, 4675.0, 5760.0, 5085.0, 4035.0, 4165.0, 3350.0, 4295.0, 7645.0, 6665.0, 6195.0, 5660.0, 6420.0, 3640.0, 4520.0, 5500.0, 4385.0, 6220.0, 5855.0, 5075.0, 4485.0, 6055.0, 4245.0, 4615.0, 4950.0, 4980.0, 1205.0, 5695.0, 6495.0, 3790.0, 4535.0, 5065.0, 6050.0, 5050.0, 3750.0, 5310.0, 4440.0, 5185.0, 6095.0, 6635.0, 5480.0, 4480.0, 6385.0, 4960.0, 5290.0, 4865.0, 5540.0, 5310.0, 6600.0, 5750.0, 6165.0, 6130.0, 6740.0, 4010.0, 4000.0, 1865.0, 5610.0, 3135.0, 5240.0, 6560.0, 3905.0, 4225.0, 2935.0, 5005.0, 5550.0, 6630.0, 3945.0, 4440.0, 6340.0, 3885.0, 5790.0, 5085.0, 4640.0, 4970.0, 4155.0, 5280.0, 5580.0, 6485.0, 6125.0, 3325.0, 5890.0, 4715.0, 4750.0, 5430.0, 6255.0, 4220.0, 5070.0, 5520.0, 6275.0, 5815.0, 3010.0, 3425.0, 4725.0, 5585.0, 4280.0, 4455.0, 5915.0, 5360.0, 5415.0, 2950.0, 5340.0, 5710.0, 3910.0, 7345.0, 6360.0, 5390.0, 5710.0, 5640.0, 4390.0, 3345.0, 6030.0, 6925.0, 4865.0, 5990.0, 6410.0, 5180.0, 5210.0, 8205.0, 4920.0, 5650.0, 6565.0, 6825.0, 5880.0, 5170.0, 5715.0, 3840.0, 4760.0, 6445.0, 3435.0, 6045.0, 2695.0, 4390.0, 3580.0, 3645.0, 4835.0, 5160.0, 2720.0, 5765.0, 5865.0, 5655.0, 1980.0, 5985.0, 4920.0, 5580.0, 4330.0, 4835.0, 5095.0, 3630.0, 6935.0, 6660.0, 5195.0, 6520.0, 7285.0, 4235.0, 7005.0, 4685.0, 5560.0, 3835.0, 5405.0, 5630.0, 4830.0, 5855.0, 4710.0, 5080.0, 7005.0, 5525.0, 5670.0, 4255.0, 4175.0, 4280.0, 6765.0, 3305.0, 2890.0, 5985.0, 6580.0, 5940.0, 4970.0, 5750.0, 3955.0, 3670.0, 4415.0, 4125.0, 4740.0, 3255.0, 5425.0, 6390.0, 6240.0, 5870.0, 4315.0, 5590.0, 5450.0, 4120.0, 4925.0, 5485.0, 4075.0, 3895.0, 6470.0, 5725.0, 5590.0, 3535.0, 5510.0, 7595.0, 3985.0, 6580.0, 5165.0, 6805.0, 5945.0, 5595.0, 5395.0, 7300.0, 4580.0, 6765.0, 6345.0, 6350.0, 4440.0, 5550.0, 3135.0, 6230.0, 4485.0, 7095.0, 3580.0, 4060.0, 5605.0, 2960.0, 5655.0, 6175.0, 5450.0, 5320.0, 6020.0, 4435.0, 5760.0, 6830.0, 5775.0, 4720.0, 6320.0, 5750.0, 4235.0, 7075.0, 4180.0, 6325.0, 6375.0, 4840.0, 6675.0, 4865.0, 7175.0, 3840.0, 4585.0, 6580.0, 5345.0, 5260.0, 5260.0, 4885.0, 3155.0, 3480.0, 5300.0, 2395.0, 4980.0, 3905.0, 4820.0, 5080.0, 6160.0, 5200.0, 3925.0, 5730.0, 5100.0, 4375.0, 5660.0, 4515.0, 4655.0, 6160.0, 3425.0, 4345.0, 4950.0, 6145.0, 5935.0, 4935.0, 6005.0, 5235.0, 3590.0, 5145.0, 6255.0, 3410.0, 3315.0, 5605.0, 5940.0, 4540.0, 5060.0, 5590.0, 6050.0, 5105.0, 7455.0, 3650.0, 2820.0, 4690.0, 4315.0, 5875.0, 4450.0, 5350.0, 5825.0, 4640.0, 2970.0, 5810.0, 6190.0, 3910.0, 6025.0, 3385.0, 6665.0, 5250.0, 4830.0, 5930.0, 3835.0, 3545.0, 6350.0, 6900.0, 3465.0, 5585.0, 4080.0, 4545.0, 4095.0, 6565.0, 6330.0, 5595.0, 4920.0, 5475.0, 2200.0, 4660.0, 2985.0, 5755.0, 5095.0, 4780.0, 3855.0, 6815.0, 6605.0, 6410.0, 6195.0, 5560.0, 5265.0, 4415.0, 6375.0, 4285.0, 4485.0, 5650.0, 5135.0, 4445.0, 5850.0, 6370.0, 5235.0, 3595.0, 4950.0, 5870.0, 3840.0, 4725.0, 4160.0, 4825.0, 5940.0, 6495.0, 5490.0, 4645.0, 6335.0, 4215.0, 5025.0, 4895.0, 4715.0, 4685.0, 7150.0, 3815.0, 5450.0, 4645.0, 4825.0, 5660.0, 6310.0, 4920.0, 4045.0, 5820.0, 5550.0, 3960.0, 4500.0, 6805.0, 4135.0, 5490.0, 5025.0, 5640.0, 5430.0, 4730.0, 5930.0, 4635.0, 5425.0, 5860.0, 4770.0, 3770.0, 5170.0, 4980.0, 5090.0, 5125.0, 5680.0, 5270.0, 4940.0, 5000.0, 6095.0, 5020.0, 5180.0, 4125.0, 5740.0, 2935.0, 5690.0, 3470.0, 5885.0, 4715.0, 6370.0, 5360.0, 6510.0, 4880.0, 6455.0, 5785.0, 7475.0, 4060.0, 4610.0, 5405.0, 4120.0, 5595.0, 5145.0, 4920.0, 6195.0, 5415.0, 4755.0, 4995.0, 5400.0, 4620.0, 7295.0, 3145.0, 3965.0, 5620.0, 4530.0, 4395.0, 4310.0, 5730.0, 6005.0, 4105.0, 5415.0, 4085.0, 5580.0, 5130.0, 5070.0, 5370.0, 4470.0, 6490.0, 6135.0, 6855.0, 4230.0, 4215.0, 5800.0, 4675.0, 6765.0, 1940.0, 4595.0, 5130.0, 5330.0, 5115.0, 4445.0, 4505.0, 4435.0, 5850.0, 7060.0, 4335.0, 2885.0, 4820.0, 5190.0, 3860.0, 3610.0, 6110.0, 5345.0, 5670.0, 4955.0, 4225.0, 5295.0, 2850.0, 5605.0, 3305.0, 6705.0, 6365.0, 6065.0, 5495.0, 5660.0, 2995.0, 4665.0, 6095.0, 4870.0, 4415.0, 5825.0, 4995.0, 5615.0, 4565.0, 5865.0, 5155.0, 5520.0, 4475.0, 4100.0, 5370.0, 4860.0, 7840.0, 4510.0, 5200.0, 3290.0, 4475.0, 4755.0, 7005.0, 4060.0, 5280.0, 7010.0, 5245.0, 5170.0, 5205.0, 5315.0, 4880.0, 5420.0, 6135.0, 3645.0, 6365.0, 3835.0, 6395.0, 6115.0, 5840.0, 5575.0, 4225.0, 5375.0, 7435.0, 5200.0, 4495.0, 5190.0, 2535.0, 4365.0, 3370.0, 4410.0, 4050.0, 6290.0, 5675.0, 4480.0, 6480.0, 4485.0, 3525.0, 4140.0, 5180.0, 4775.0, 4160.0, 4835.0, 6200.0, 4835.0, 4105.0, 4610.0, 6450.0, 4590.0, 5380.0, 5155.0, 4380.0, 4990.0, 3925.0, 5470.0, 3260.0, 4710.0, 6215.0, 4820.0, 6630.0, 4635.0, 4155.0, 6110.0, 4245.0, 2735.0, 5435.0, 4810.0, 6035.0, 8430.0, 6545.0, 6290.0, 7295.0, 5050.0, 5130.0, 5435.0, 3790.0, 5200.0, 7080.0, 5080.0, 5350.0, 4855.0, 4260.0, 4610.0, 4050.0, 6415.0, 5120.0, 4740.0, 4230.0, 6935.0, 6925.0, 5610.0, 3025.0, 4335.0, 4150.0, 5665.0, 5030.0, 6435.0, 7575.0, 5915.0, 5585.0, 4135.0, 6560.0, 4810.0, 3930.0, 4495.0, 6290.0, 4905.0, 3795.0, 6285.0, 3775.0, 4605.0, 4555.0, 5135.0, 5825.0, 5755.0, 6010.0, 5735.0, 4870.0, 5005.0, 5155.0, 4190.0, 5550.0, 5140.0, 7195.0, 7150.0, 6520.0, 6380.0, 4990.0, 4480.0, 6610.0, 6050.0, 4445.0, 6335.0, 4825.0, 3760.0, 3995.0, 4705.0, 4980.0, 4195.0, 5520.0, 5215.0, 2145.0, 5795.0, 5580.0, 4560.0, 4260.0, 7245.0, 4795.0, 4845.0, 5200.0, 5015.0, 3450.0, 7110.0, 6930.0, 5610.0, 5530.0, 4740.0, 5245.0, 4155.0, 5985.0, 3465.0, 4525.0, 6875.0, 6205.0, 4840.0, 5690.0, 6420.0, 6105.0, 5570.0, 5285.0, 4515.0, 5265.0, 4915.0, 4610.0, 4410.0, 6315.0, 5215.0, 5900.0, 5615.0, 6425.0, 5700.0, 4050.0, 5675.0, 4990.0, 2995.0, 4760.0, 5205.0, 5845.0, 3740.0, 4280.0, 6200.0, 4245.0, 5345.0, 5900.0, 5540.0, 4065.0, 4345.0, 6165.0, 5680.0, 4310.0, 5430.0, 5850.0, 3185.0, 6230.0, 5390.0, 4280.0, 6580.0, 2215.0, 3530.0, 5945.0, 5345.0, 6730.0, 5470.0, 4915.0, 4960.0, 6160.0, 5220.0, 6890.0, 3525.0, 4595.0, 4260.0, 5295.0, 4875.0, 4955.0, 4190.0, 5350.0, 6325.0, 3575.0, 6300.0, 6410.0, 5180.0, 6500.0, 6300.0, 5655.0, 6140.0, 4375.0, 5295.0, 4425.0, 4885.0, 4220.0, 6090.0, 4715.0, 5270.0, 5040.0, 5285.0, 5105.0, 4800.0, 5480.0, 4835.0, 5825.0, 4275.0, 6855.0, 4895.0, 6590.0, 6490.0, 4440.0, 5595.0, 3785.0, 4130.0, 5530.0, 4620.0, 5920.0, 5730.0, 4615.0, 7100.0, 4695.0, 5505.0, 5295.0, 4330.0, 7200.0, 6895.0, 5135.0, 6815.0, 3475.0, 6555.0, 3955.0, 5440.0, 5340.0, 5415.0, 3065.0, 7695.0, 5305.0, 5925.0, 5870.0, 5230.0, 3730.0, 4140.0, 4795.0, 5035.0, 4375.0, 4415.0, 6035.0, 5205.0, 5490.0, 5680.0, 4610.0, 3720.0, 4915.0, 8990.0, 3475.0, 4695.0, 4495.0, 6095.0, 4220.0, 6155.0, 5125.0, 4625.0, 5275.0, 4420.0, 8285.0, 4240.0, 5100.0, 4615.0, 6370.0, 4435.0, 5490.0, 6460.0, 3730.0, 5995.0, 5905.0, 5615.0, 7090.0, 5380.0, 4000.0, 2210.0, 4885.0, 3910.0, 5305.0, 4410.0, 5375.0, 5185.0, 4855.0, 7445.0, 3290.0, 4345.0, 3365.0, 4745.0, 4825.0, 4820.0, 6710.0, 4495.0, 4355.0, 4935.0, 3590.0, 6270.0, 4700.0, 5035.0, 5080.0, 5180.0, 5375.0, 4500.0, 4545.0, 3915.0, 6025.0, 5320.0, 5220.0, 7055.0, 5005.0, 3110.0, 5655.0, 2005.0, 3520.0, 7040.0, 4030.0, 6035.0, 3520.0, 6625.0, 5005.0, 2765.0, 5095.0, 5710.0, 4690.0, 6140.0, 5295.0, 4395.0, 4745.0, 5720.0, 4400.0, 5030.0, 4815.0, 8350.0, 3705.0, 4780.0, 4820.0, 4740.0, 6320.0, 4115.0, 5775.0, 4815.0, 2915.0, 5705.0, 6130.0, 4920.0, 3760.0, 5400.0, 5330.0, 5975.0, 4450.0, 4060.0, 5785.0, 5205.0, 5055.0, 3930.0, 3705.0, 4420.0, 4530.0, 4755.0, 6365.0, 4315.0, 4675.0, 5800.0, 5580.0, 5820.0, 5530.0, 6355.0, 4415.0, 7860.0, 4305.0, 5260.0, 4795.0, 5855.0, 4600.0, 5120.0, 5585.0, 5660.0, 5500.0, 2045.0, 4720.0, 3350.0, 3225.0, 6740.0, 4905.0, 5140.0, 4960.0, 6730.0, 5640.0, 4890.0, 3455.0, 7155.0, 4470.0, 4610.0, 4005.0, 6045.0, 3475.0, 3945.0, 4770.0, 3805.0, 7455.0, 5355.0, 4515.0, 6075.0, 5870.0, 5290.0, 4170.0, 5425.0, 5445.0, 5285.0, 4285.0, 5090.0, 5795.0, 5055.0, 6250.0, 5185.0, 7315.0, 3395.0, 5035.0, 3645.0, 3870.0, 5435.0, 5290.0, 4695.0, 6170.0, 4795.0, 3250.0, 5850.0, 5420.0, 5260.0, 4825.0, 5995.0, 5980.0, 4945.0, 4915.0, 5280.0, 4760.0, 5175.0, 4700.0, 4490.0, 3460.0, 3855.0, 4850.0, 4540.0, 4580.0, 5195.0, 3650.0, 2225.0, 4105.0, 4960.0, 5220.0, 5285.0, 5575.0, 6060.0, 5915.0, 6060.0, 3875.0, 4365.0, 5605.0, 4075.0, 5420.0, 5800.0, 5690.0, 4720.0, 6810.0, 4515.0, 6145.0, 5970.0, 7305.0, 4890.0, 5160.0, 4315.0, 3495.0, 2890.0, 4660.0, 4695.0, 4755.0, 4575.0, 4510.0, 4700.0, 6180.0, 5390.0, 6960.0, 4790.0, 5170.0, 6490.0, 5465.0, 5550.0, 4980.0, 4315.0, 4675.0, 5150.0, 4895.0, 6625.0, 4875.0, 5765.0, 6100.0, 4800.0, 3695.0, 5375.0, 4875.0, 6345.0, 5385.0, 4885.0, 6865.0, 5380.0, 6115.0, 6070.0, 4955.0, 6080.0, 5675.0, 4970.0, 5165.0, 6575.0, 5800.0, 7080.0, 4765.0, 5900.0, 4765.0, 5010.0, 4775.0, 4195.0, 3695.0, 5565.0, 5475.0, 3650.0, 4730.0, 5020.0, 5275.0, 4985.0, 2920.0, 3440.0, 4775.0, 4745.0, 3530.0, 4490.0, 5300.0, 3880.0, 6265.0, 3965.0, 4255.0, 4615.0, 6060.0, 5140.0, 3830.0, 5410.0, 6435.0, 7040.0, 5105.0, 5400.0, 6325.0, 6340.0, 5450.0, 6185.0, 5140.0, 4690.0, 4530.0, 4175.0, 6465.0, 3855.0, 4865.0, 6550.0, 2760.0, 4475.0, 4620.0, 5210.0, 4570.0, 4175.0, 5650.0, 5175.0, 5130.0, 5405.0, 5615.0, 4660.0, 6095.0, 4805.0, 4400.0, 3995.0, 4435.0, 5515.0, 4245.0, 4720.0, 4610.0, 5340.0, 4265.0, 4995.0, 6540.0, 4610.0, 6395.0, 6970.0, 5205.0, 4620.0, 3670.0, 2805.0, 4245.0, 5780.0, 5330.0, 5860.0, 4600.0, 7480.0, 5200.0, 2495.0, 6595.0, 5540.0, 4565.0, 4185.0, 5990.0, 4615.0, 3520.0, 5415.0, 3025.0, 5210.0, 4310.0, 5865.0, 5645.0, 5155.0, 4185.0, 4000.0, 5990.0, 5015.0, 5475.0, 5940.0, 5395.0, 4750.0, 5305.0, 3705.0, 5120.0, 5745.0, 5185.0, 5875.0, 4725.0, 6085.0, 5685.0, 4400.0, 4630.0, 6810.0, 4690.0, 5460.0, 6925.0, 6760.0, 4590.0, 4205.0, 4905.0, 4565.0, 3860.0, 4435.0, 5745.0, 5475.0, 7060.0, 3685.0, 5925.0, 4695.0, 5305.0, 4445.0, 2380.0, 5590.0, 4945.0, 3965.0, 3780.0, 4585.0, 5065.0, 5905.0, 5635.0, 4020.0, 2270.0, 5415.0, 3115.0, 3050.0, 5850.0, 4185.0, 5735.0, 6205.0, 7095.0, 4380.0, 4060.0, 4980.0, 4935.0, 5170.0, 4935.0, 5985.0, 5130.0, 5810.0, 5370.0, 4970.0, 3225.0, 5830.0, 5460.0, 6655.0, 2535.0, 6050.0, 5565.0, 5580.0, 6250.0, 3765.0, 6855.0, 5260.0, 5060.0, 6155.0, 4990.0, 4110.0, 3155.0, 6270.0, 5410.0, 4805.0, 5185.0, 6785.0, 6170.0, 5275.0, 4910.0, 5070.0, 3995.0, 6040.0, 5905.0, 6015.0, 4770.0, 2665.0, 5620.0, 5200.0, 5245.0, 5235.0, 4625.0, 4130.0, 4730.0, 3180.0, 5100.0, 4195.0, 5725.0, 4920.0, 4500.0, 6005.0, 6710.0, 5350.0, 5465.0, 4335.0, 4470.0, 5380.0, 4750.0, 6160.0, 3050.0, 5080.0, 6115.0, 5145.0, 6330.0, 4280.0, 6115.0, 5385.0, 4230.0, 6445.0, 3965.0, 6115.0, 5025.0, 6065.0, 5515.0, 5305.0, 4965.0, 5190.0, 4835.0, 6160.0, 4495.0, 3125.0, 4475.0, 5985.0, 4520.0, 2690.0, 3775.0, 5505.0, 5540.0, 5550.0, 5465.0, 5750.0, 4130.0, 3870.0, 5505.0, 6805.0, 5450.0, 4400.0, 4905.0, 3785.0, 5430.0, 4375.0, 4200.0, 3865.0, 5460.0, 3625.0, 3930.0, 4850.0, 6345.0, 5155.0, 4940.0, 4820.0, 5440.0, 5150.0, 6905.0, 4455.0, 6040.0, 3225.0, 4240.0, 5445.0, 5290.0, 6405.0, 6075.0, 5335.0, 4585.0, 4575.0, 3920.0, 5870.0, 5045.0, 5645.0, 7160.0, 6635.0, 5340.0, 6285.0, 4500.0, 4975.0, 4515.0, 6125.0, 3730.0, 5720.0, 5200.0, 4490.0, 3900.0, 2380.0, 4235.0, 5055.0, 4715.0, 4630.0, 4835.0, 5565.0, 6610.0, 5265.0, 2565.0, 5225.0, 3530.0, 5565.0, 5885.0, 4355.0, 6030.0, 7795.0, 6780.0, 4150.0, 5810.0, 6140.0, 5000.0, 5250.0, 3615.0, 1985.0, 3930.0, 5235.0, 5660.0, 5640.0, 4415.0, 3600.0, 4675.0, 4010.0, 4230.0, 3955.0, 5050.0, 4200.0, 3110.0, 5965.0, 5725.0, 6465.0, 4240.0, 6705.0, 6600.0, 6855.0, 5175.0, 5475.0, 6055.0, 4285.0, 6215.0, 6410.0, 6380.0, 4800.0, 4845.0, 2800.0, 5170.0, 5390.0, 5255.0, 5705.0, 4360.0, 5765.0, 3440.0, 6115.0, 5985.0, 4670.0, 5470.0, 4155.0, 4155.0, 6645.0, 3280.0, 6140.0, 5135.0, 4670.0, 6605.0, 4665.0, 4335.0, 5570.0, 4730.0, 3985.0, 6680.0, 2910.0, 4265.0, 4350.0, 4770.0, 5880.0, 6125.0, 4755.0, 5310.0, 4930.0, 5705.0, 3290.0, 2715.0, 4560.0, 6465.0, 4475.0, 6945.0, 5440.0, 6195.0, 4455.0, 3920.0, 4295.0, 6600.0, 5730.0, 5615.0, 6515.0, 5365.0, 7385.0, 5805.0, 6675.0, 5725.0, 5635.0, 5200.0, 3770.0, 4840.0, 5595.0, 3655.0, 3715.0, 6195.0, 4290.0, 6805.0, 4890.0, 5930.0, 3910.0, 2415.0, 4270.0, 5135.0, 4705.0, 5015.0, 6845.0, 5925.0, 4800.0, 3635.0, 6005.0, 2470.0, 4490.0, 3715.0, 5145.0, 3810.0, 6055.0, 4635.0, 2480.0, 4855.0, 4815.0, 4865.0, 6525.0, 5845.0, 5715.0, 5680.0, 5305.0, 5875.0, 5865.0, 6195.0, 4960.0, 5395.0, 5315.0, 3725.0, 2910.0, 5080.0, 4730.0, 4840.0, 6850.0, 2630.0, 5295.0, 5035.0, 4470.0, 4770.0, 4300.0, 5975.0, 5410.0, 3840.0, 5185.0, 3180.0, 4685.0, 7800.0, 5410.0, 5970.0, 4540.0, 4850.0, 5170.0, 4505.0, 5660.0, 2995.0, 4725.0, 5165.0, 3665.0, 3460.0, 4670.0, 4215.0, 5750.0, 4565.0, 3790.0, 5140.0, 6075.0, 5420.0, 4915.0, 4450.0, 5120.0, 4830.0, 6600.0, 5235.0, 5005.0, 5065.0, 4030.0, 5505.0, 5180.0, 5265.0, 4205.0, 3220.0, 4305.0, 4310.0, 5290.0, 4270.0, 6060.0, 4995.0, 3915.0, 5900.0, 4170.0, 4545.0, 5985.0, 6015.0, 5415.0, 4585.0, 5565.0, 3690.0, 4965.0, 5110.0, 4510.0, 7320.0, 4800.0, 5800.0, 5825.0, 4450.0, 5200.0, 4485.0, 4885.0, 3690.0, 5460.0, 4610.0, 4680.0, 3100.0, 6755.0, 4625.0, 3390.0, 5875.0, 5305.0, 5075.0, 4495.0, 5460.0, 4490.0, 4520.0, 3245.0, 5700.0, 3690.0, 4645.0, 5990.0, 5265.0, 7285.0, 6355.0, 4110.0, 5970.0, 5120.0, 5480.0, 3720.0, 5090.0, 3865.0, 5795.0, 6185.0, 6190.0, 4065.0, 5700.0, 5220.0, 4660.0, 5950.0, 4790.0, 4495.0, 5200.0, 5590.0, 6080.0, 3905.0, 5630.0, 5060.0, 5280.0, 4675.0, 6170.0, 5180.0, 3990.0, 2650.0, 7290.0, 4535.0, 5895.0, 3830.0, 4835.0, 3555.0, 2360.0, 3640.0, 4720.0, 4935.0, 6340.0, 4790.0, 4520.0, 5145.0, 7455.0, 6175.0, 4550.0, 4310.0, 3645.0, 5060.0, 6725.0, 4195.0, 5445.0, 5390.0, 4315.0, 6145.0, 5720.0, 6480.0, 5125.0, 6360.0, 3980.0, 5265.0, 5595.0, 3575.0, 6160.0, 6375.0, 3970.0, 3645.0, 5670.0, 5600.0, 4080.0, 3760.0, 5875.0, 5875.0, 4135.0, 5925.0, 4165.0, 5685.0, 7270.0, 5280.0, 6670.0, 4690.0, 3115.0, 4370.0, 5235.0, 5700.0, 4495.0, 3920.0, 3840.0, 3960.0, 6015.0, 6225.0, 5470.0, 5010.0, 5225.0, 5290.0, 6775.0, 4375.0, 6715.0, 6115.0, 5995.0, 3260.0, 4385.0, 3635.0, 4295.0, 5530.0, 6860.0, 6490.0, 4820.0, 4075.0, 3280.0, 5140.0, 5420.0, 6955.0, 6950.0, 4395.0, 3945.0, 6635.0, 6110.0, 5735.0, 5190.0, 4255.0, 4290.0, 4510.0, 5325.0, 5080.0, 4620.0, 4555.0, 4825.0, 4855.0, 3420.0, 6735.0, 7335.0, 3680.0, 4015.0, 4430.0, 4425.0, 6320.0, 5815.0, 4515.0, 3695.0, 6895.0, 6105.0, 4905.0, 5040.0, 5980.0, 6245.0, 4170.0, 5135.0, 6675.0, 5855.0, 4990.0, 5600.0, 6305.0, 3505.0, 3955.0, 3710.0, 5085.0, 4025.0, 4675.0, 4385.0, 3815.0, 6120.0, 4710.0, 5000.0, 5675.0, 5175.0, 5390.0, 4360.0, 5385.0, 6985.0, 5925.0, 4035.0, 5810.0, 2835.0, 5625.0, 4870.0, 5625.0, 3685.0, 5920.0, 4435.0, 6020.0, 5890.0, 5615.0, 5950.0, 3860.0, 4620.0, 6925.0, 4960.0, 5845.0, 3190.0, 6100.0, 6285.0, 6685.0, 4770.0, 5075.0, 4855.0, 4715.0, 5475.0, 5070.0, 4290.0, 3610.0, 8455.0, 6590.0, 6700.0, 6125.0, 4665.0, 2630.0, 4755.0, 5365.0, 4845.0, 3450.0, 4615.0, 4605.0, 7725.0, 5415.0, 6045.0, 4385.0, 6430.0, 6670.0, 5180.0, 5310.0, 7315.0, 3145.0, 4640.0, 4855.0, 5130.0, 6645.0, 5825.0, 4990.0, 5120.0, 4240.0, 4145.0, 5000.0, 6595.0, 4965.0, 4135.0, 6750.0, 3140.0, 5180.0, 7065.0, 7060.0, 3365.0, 4940.0, 6075.0, 6525.0, 6505.0, 4325.0, 6485.0, 5565.0, 5790.0, 3610.0, 2825.0, 6565.0, 4920.0, 3165.0, 5220.0, 7495.0, 6455.0, 5045.0, 5015.0, 7485.0, 5135.0, 5420.0, 4895.0, 5755.0, 5525.0, 5325.0, 5915.0, 4640.0, 5395.0, 5145.0, 5905.0, 4165.0, 3080.0, 4270.0, 4490.0, 5340.0, 3960.0, };
        // 10-80 spread, 2 main deviations, leave table at 3+, split only once (20000 hour sample) $10.6/hour

        int avage = 0;
        //change tenToEighty to whatever array is being used
        for(int i = 0; i < tenToEighty.length; i++){
            avage += tenToEighty[i];
        }
        //prints final average of all the integers in the array
        System.out.println(avage / tenToEighty.length);
    }
}
